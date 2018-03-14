package org.wang.restmall.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.wang.restmall.command.CommodityCommand;
import org.wang.restmall.model.Commodity;
import org.wang.restmall.service.CommodityService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@RestController public class CommodityController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired CommodityService commodityService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   commodityCommand  表单提交的 commodity 信息
   *
   * @return  Http 状态码
   */
  @RequestMapping(
    value  = "/commodity",
    method = RequestMethod.POST
  )
  public ResponseEntity createCommodity(CommodityCommand commodityCommand) {
    if (commodityCommand != null) {
      Commodity commodity = commodityCommand.toCommodity();
      commodityService.save(commodity);

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id  commodity 的 Id
   *
   * @return  Http 状态码
   */
  @RequestMapping(
    value  = "/commodity/{id}",
    method = RequestMethod.DELETE
  )
  public ResponseEntity deleteCommodity(Long id) {
    Commodity commodity = commodityService.findOne(id);

    if (commodity != null) {
      commodityService.delete(commodity);

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id  commodity 的 Id
   *
   * @return  commodity 信息 + Http 状态码
   */
  @RequestMapping(
    value  = "/commodity/{id}",
    method = RequestMethod.GET
  )
  public ResponseEntity<CommodityCommand> getAddress(Long id) {
    Commodity        commodity        = commodityService.findOne(id);
    CommodityCommand commodityCommand = new CommodityCommand(commodity);

    return new ResponseEntity<CommodityCommand>(commodityCommand, HttpStatus.OK);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   commodityCommand  表单提交的 commodity 信息
   *
   * @return  Http 状态码
   */
  @RequestMapping(
    value  = "/commodity",
    method = RequestMethod.PATCH
  )
  public ResponseEntity updateAddress(CommodityCommand commodityCommand) {
    if (commodityCommand != null) {
      Commodity commodity = commodityService.findOne(commodityCommand.getId());
      commodityService.save(commodityCommand.updateCommodity(commodity));

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

} // end class CommodityController
