package org.wang.restmall.command;

import org.wang.restmall.model.User;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class UserCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Long   id;
  private String name;
  private String password;

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
    this.password = user.getPassWord();
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
  public String getPassword() {
    return password;
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
   * @param  password  DOCUMENT ME!
   */
  public void setPassword(String password) {
    this.password = password;
  }

} // end class UserCommand
