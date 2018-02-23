package org.wang.restmall.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.wang.restmall.command.UserCommand;
import org.wang.restmall.model.User;
import org.wang.restmall.service.UserService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@RestController public class UserController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * DOCUMENT ME!
   *
   * @param   request  DOCUMENT ME!
   * @param   id       DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  @RequestMapping(
    value  = "/user/{id}",
    method = RequestMethod.GET
  )
  public ResponseEntity<UserCommand> userInfo(HttpServletRequest request,
    @PathVariable("id") Long id) {
    User        user        = userService.findOne(id);
    UserCommand userCommand = new UserCommand(user);

    return new ResponseEntity<UserCommand>(userCommand, HttpStatus.OK);
  }


} // end class UserController
