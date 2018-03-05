package org.wang.restmall.command;

import org.wang.restmall.model.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@ApiModel(
  value       = "User",
  description = "用户对象"
)
public class UserCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @ApiModelProperty(value = "ID")
  private Long   id;
  @ApiModelProperty(value = "用户名")
  private String name;
  @ApiModelProperty(value = "密码")
  private String passWord;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new UserCommand object.
   */
  public UserCommand() { }

  /**
   * Creates a new UserCommand object.
   *
   * @param  user  DOCUMENT ME!
   */
  public UserCommand(User user) {
    this.id       = user.getId();
    this.name     = user.getName();
    this.passWord = user.getPassWord();
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getPassWord() {
    return passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  id  DOCUMENT ME!
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  name  DOCUMENT ME!
   */
  public void setName(String name) {
    this.name = name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  passWord  DOCUMENT ME!
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   userCommand  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public User toUser(UserCommand userCommand) {
    User user = new User();
    user.setName(userCommand.getName());
    user.setPassWord(userCommand.getPassWord());

    return user;
  }
} // end class UserCommand
