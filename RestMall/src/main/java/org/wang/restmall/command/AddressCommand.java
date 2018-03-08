package org.wang.restmall.command;

import java.util.Date;

import org.wang.restmall.model.Address;
import org.wang.restmall.model.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;


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
  private String address;

  @ApiModelProperty(
    value  = "地址所属的用户",
    hidden = true
  )
  @ApiParam(hidden = true)
  private User consumer;

  @ApiModelProperty(value = "创建时间")
  private Date    createDate;
  @ApiModelProperty(value = "是否为默认地址")
  private Boolean defaultAddress;

  @ApiModelProperty(value = "ID")
  private Long id;

  @ApiModelProperty(value = "地址所属的用户 ID")
  private Long userId;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new AddressCommand object.
   */
  public AddressCommand() { }

  /**
   * Creates a new AddressCommand object.
   *
   * @param  address  DOCUMENT ME!
   */
  public AddressCommand(Address address) {
    this.id = address.getId();

    if (address.getConsumer() != null) {
      this.userId = address.getConsumer().getId();
    }

    this.createDate     = address.getCreateDate();
    this.defaultAddress = address.getDefaultAddress();
  }

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
  public Date getCreateDate() {
    return createDate;
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
   * @return  DOCUMENT ME!
   */
  public Long getUserId() {
    return userId;
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
   * @param  createDate  DOCUMENT ME!
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  userId  DOCUMENT ME!
   */
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Address toAddress() {
    Address address = new Address();
    address.setAddress(this.address);

    if (this.userId != null) {
      User user = new User();
      user.setId(this.userId);
      address.setConsumer(user);
    }

    address.setDefaultAddress(this.defaultAddress);
    address.setId(this.id);
    address.setCreateDate(this.createDate);

    return address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   address  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Address updateAddress(Address address) {
    address.setDefaultAddress(this.defaultAddress);
    address.setAddress(this.address);

    return address;
  }
} // end class AddressCommand
