package org.wang.restmall.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.wang.restmall.command.AddressCommand;
import org.wang.restmall.command.UserCommand;
import org.wang.restmall.model.Address;
import org.wang.restmall.model.User;
import org.wang.restmall.service.AddressService;
import org.wang.restmall.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
// @Api：用在类上，说明该类的作用
@Api(value = "User模块")
@RestController public class UserController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AddressService addressService;

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   consumerId  用户Id
   *
   * @return  该用户的所有地址信息 + Http 状态码
   */
  @RequestMapping(
    value  = "/user/{consumerId}/address",
    method = RequestMethod.GET
  )
  public ResponseEntity<List<AddressCommand>> addressList(@PathVariable Long consumerId) {
    Set<Address>         addressSet  = addressService.findByConsumerId(consumerId);
    List<AddressCommand> addressList = new ArrayList<>();

    if (addressSet != null) {
      for (Address address : addressSet) {
        addressList.add(new AddressCommand(address));
      }

      return new ResponseEntity<List<AddressCommand>>(addressList, HttpStatus.OK);
    }

    return new ResponseEntity<List<AddressCommand>>(addressList, HttpStatus.FAILED_DEPENDENCY);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   userCommand   表单提交的 user 信息
   *
   * @return  Http 状态码
   */
  @ApiOperation(
    value = "创建一个新的 User",
    notes = " 根据表单内容创建一个新的 User"
  )
  @RequestMapping(
    value  = "/user",
    method = RequestMethod.POST
  )
// @ApiImplicitParams({
// @ApiImplicitParam(paramType = "form",name = "name", value = "姓名", required = true),
// @ApiImplicitParam(paramType = "form",name = "passWord", value = "passWord", required = true),
////      @ApiImplicitParam(paramType = "body", dataType = "UserCommand", name = "userCommand", value = "用户信息", required = true)
//
// })
  public ResponseEntity createUser(UserCommand userCommand) {
    if (userCommand != null) {
      User user = userCommand.toUser();
      userService.saveUser(user);

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id  user 的 Id
   *
   * @return  Http 状态码
   */
  @ApiOperation(
    value = "删除用户",
    notes = "删除用户"
  )
  @RequestMapping(
    value  = "/user/{id}",
    method = RequestMethod.DELETE
  )
  public ResponseEntity deleteUser(@ApiParam(
      value    = "用户Id",
      required = true
    )
    @PathVariable Long id) {
    User user = userService.findOne(id);

    if (user != null) {
      userService.delete(user);

      return new ResponseEntity(HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.FAILED_DEPENDENCY);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   userCommand  表单提交的 user 信息
   *
   * @return  user 信息 + Http 状态码
   */
  @ApiOperation(
    value = "修改 User信息",
    notes = "根据表单内容修改 User 的信息"
  )
  @RequestMapping(
    value  = "/user",
    method = RequestMethod.PATCH
  )
  public ResponseEntity updateUser(UserCommand userCommand) {
    if (userCommand != null) {
      User user = userCommand.toUser();

      userService.saveUser(user);

      return new ResponseEntity<UserCommand>(new UserCommand(user), HttpStatus.OK);
    }

    return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   request  DOCUMENT ME!
   * @param   id       用户 Id
   *
   * @return  user 信息 + Http 状态码
   */

  // @ApiOperation：用在方法上，说明方法的作用
  @ApiOperation(
    value = "获取单个用户",
    notes = "传入id获取单个用户"
  )
  @RequestMapping(
    value  = "/user/{id}",
    method = RequestMethod.GET
  )
  public ResponseEntity<UserCommand> userInfo(HttpServletRequest request,
    @ApiParam(
      value    = "用户Id",
      required = true
    )
    @PathVariable Long id) {
    User        user        = userService.findOne(id);
    UserCommand userCommand = new UserCommand(user);

    return new ResponseEntity<UserCommand>(userCommand, HttpStatus.OK);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   request  DOCUMENT ME!
   *
   * @return  所有的 user
   */
  @ApiOperation(
    value = "获取所有用户",
    notes = "请求获取所有用户信息"
  )
  @RequestMapping(
    value  = "/user",
    method = RequestMethod.GET
  )
  public ResponseEntity<List<UserCommand>> userList(HttpServletRequest request) {
    List<User>        userList        = userService.findAll();
    List<UserCommand> userCommandList = new ArrayList<>();

    for (User user : userList) {
      UserCommand userCommand = new UserCommand(user);
      userCommandList.add(userCommand);
    }

    return new ResponseEntity<List<UserCommand>>(userCommandList, HttpStatus.OK);
  }

} // end class UserController
