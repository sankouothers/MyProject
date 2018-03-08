package org.wang.restmall.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.wang.restmall.command.AddressCommand;
import org.wang.restmall.model.Address;
import org.wang.restmall.service.AddressService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
// @Api：用在类上，说明该类的作用
@Api(value = "Address 模块")
@RestController public class AddressController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired AddressService addressService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   addressCommand  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  @ApiOperation(
    value = "创建一个新的 address",
    notes = "根据表单内容创建一个新的 address"
  )
  @RequestMapping(
    value  = "/address",
    method = RequestMethod.POST
  )
  public ResponseEntity createAddress(AddressCommand addressCommand) {
    if (addressCommand != null) {
      Address address = addressCommand.toAddress();
      addressService.saveAddress(address);

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

} // end class AddressController
