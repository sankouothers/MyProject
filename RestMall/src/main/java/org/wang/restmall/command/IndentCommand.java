package org.wang.restmall.command;

import org.wang.restmall.model.Address;
import org.wang.restmall.model.Commodity;
import org.wang.restmall.model.Indent;
import org.wang.restmall.model.User;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class IndentCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Address   address;
  private Commodity commodity;
  private User      consumer;
  private Long      id;
  private User      merchant;
  private String    phoneNumber;
  private Integer   price;
  private String    status;
  private Integer   totalNumber;
  private Integer   totalPrice;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new IndentCommand object.
   *
   * @param  indent  DOCUMENT ME!
   */
  public IndentCommand(Indent indent) { }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Address getAddress() {
    return address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Commodity getCommodity() {
    return commodity;
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
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public User getMerchant() {
    return merchant;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Integer getPrice() {
    return price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getStatus() {
    return status;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Integer getTotalNumber() {
    return totalNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Integer getTotalPrice() {
    return totalPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  address  DOCUMENT ME!
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  commodity  DOCUMENT ME!
   */
  public void setCommodity(Commodity commodity) {
    this.commodity = commodity;
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
   * @param  id  DOCUMENT ME!
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  merchant  DOCUMENT ME!
   */
  public void setMerchant(User merchant) {
    this.merchant = merchant;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  phoneNumber  DOCUMENT ME!
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  price  DOCUMENT ME!
   */
  public void setPrice(Integer price) {
    this.price = price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  status  DOCUMENT ME!
   */
  public void setStatus(String status) {
    this.status = status;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  totalNumber  DOCUMENT ME!
   */
  public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  totalPrice  DOCUMENT ME!
   */
  public void setTotalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Indent toIndent() {
    Indent indent = new Indent();

    indent.setTotalPrice(this.totalPrice);
    indent.setTotalNumber(this.totalNumber);
    indent.setAddress(this.address);
    indent.setCommodity(this.commodity);
    indent.setConsumer(this.consumer);
    indent.setId(this.id);
    indent.setMerchant(this.merchant);
    indent.setPhoneNumber(this.phoneNumber);
    indent.setPrice(this.price);
    indent.setStatus(this.status);

    return indent;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   indent  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Indent updateIndent(Indent indent) {
    indent.setAddress(this.address);
    indent.setTotalNumber(this.totalNumber);
    indent.setTotalPrice(this.totalPrice);

    return indent;
  }
} // end class IndentCommand
