package org.wang.restmall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.wang.restmall.command.LoginCommand;
import org.wang.restmall.model.User;
import org.wang.restmall.service.UserService;
import org.wang.restmall.util.Constants;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@RestController public class LoginController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   userCommand  DOCUMENT ME!
   * @param   request      DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.POST
  )
  public ResponseEntity login(LoginCommand userCommand, HttpServletRequest request) {
    if (userCommand != null) {
      User user = userService.findByNameAndPassWord(userCommand.getName(), userCommand.getPassWord());

      if (user != null) {
        HttpSession session = request.getSession();
        session.setAttribute(Constants.USER_NAME_KEY, user.getName());
        session.setAttribute(Constants.USER_ID_KEY, user.getId());

        return new ResponseEntity(HttpStatus.OK);
      }
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

} // end class LoginController
