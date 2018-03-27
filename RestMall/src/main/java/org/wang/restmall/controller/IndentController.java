package org.wang.restmall.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.wang.restmall.command.IndentCommand;
import org.wang.restmall.model.Indent;
import org.wang.restmall.service.IndentService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@RestController public class IndentController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired IndentService indentService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   indentCommand  表单提交的 indent 信息
   *
   * @return  Http 状态码
   */
  @RequestMapping(
    value  = "/indent",
    method = RequestMethod.POST
  )
  public ResponseEntity createIndent(IndentCommand indentCommand) {
    if (indentCommand != null) {
      Indent indent = indentCommand.toIndent();
      indentService.save(indent);

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id   indent 的 Id
   *
   * @return  Http 状态码
   */
  @RequestMapping(
    value  = "/indent/{id}",
    method = RequestMethod.DELETE
  )
  public ResponseEntity deleteIndent(Long id) {
    Indent indent = indentService.findOne(id);

    if (indent != null) {
      indentService.delete(indent);

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id   Indent 的 Id
   *
   * @return  Indent 的信息 + Http 状态码
   */
  @RequestMapping(
    value  = "/indent/{id}",
    method = RequestMethod.GET
  )
  public ResponseEntity<IndentCommand> getAddress(@PathVariable Long id) {
    Indent        indent        = indentService.findOne(id);
    IndentCommand indentCommand = new IndentCommand(indent);

    return new ResponseEntity<IndentCommand>(indentCommand, HttpStatus.OK);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   indentCommand  Indent
   *
   * @return  Http 状态码
   */
  @RequestMapping(
    value  = "/indent",
    method = RequestMethod.PATCH
  )
  public ResponseEntity updateAddress(IndentCommand indentCommand) {
    if (indentCommand != null) {
      Indent indent = indentService.findOne(indentCommand.getId());
      indentService.save(indentCommand.updateIndent(indent));

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

} // end class IndentController
