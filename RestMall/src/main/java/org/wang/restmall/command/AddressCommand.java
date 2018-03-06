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
  value       = "Address",
  description = " 地址信息"
)
public class AddressCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @ApiModelProperty(value = "地址")
  private String  address;
  @ApiModelProperty(value = "地址所属的用户")
  private User    consumer;
  @ApiModelProperty(value = "是否为默认地址")
  private Boolean defaultAddress;

  @ApiModelProperty(value = "ID")
  private Long id;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getAddress() {
    return address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public User getConsumer() {
    return consumer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Boolean getDefaultAddress() {
    return defaultAddress;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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
   * @param  address  DOCUMENT ME!
   */
  public void setAddress(String address) {
    this.address = address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  consumer  DOCUMENT ME!
   */
  public void setConsumer(User consumer) {
    this.consumer = consumer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  defaultAddress  DOCUMENT ME!
   */
  public void setDefaultAddress(Boolean defaultAddress) {
    this.defaultAddress = defaultAddress;
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
} // end class AddressCommand
