package org.wang.restmall.command;

import org.wang.restmall.model.Commodity;
import org.wang.restmall.model.User;

import io.swagger.annotations.ApiModel;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@ApiModel(
  value       = "Commodity",
  description = "商品"
)
public class CommodityCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String brand;
  private String category;
  private User   creator;
  private String effect;
  private Long   id;

  private String name;
  private Long   price;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new CommodityCommand object.
   */
  public CommodityCommand() { }

  /**
   * Creates a new CommodityCommand object.
   *
   * @param  commodity  DOCUMENT ME!
   */
  public CommodityCommand(Commodity commodity) {
    this.brand    = commodity.getBrand();
    this.category = commodity.getCategory();
    this.creator  = commodity.getCreator();
    this.effect   = commodity.getEffect();
    this.id       = commodity.getId();
    this.name     = commodity.getName();
    this.price    = commodity.getPrice();
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getBrand() {
    return brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getCategory() {
    return category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public User getCreator() {
    return creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getEffect() {
    return effect;
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
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Long getPrice() {
    return price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  brand  DOCUMENT ME!
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  category  DOCUMENT ME!
   */
  public void setCategory(String category) {
    this.category = category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  creator  DOCUMENT ME!
   */
  public void setCreator(User creator) {
    this.creator = creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  effect  DOCUMENT ME!
   */
  public void setEffect(String effect) {
    this.effect = effect;
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
   * @param  price  DOCUMENT ME!
   */
  public void setPrice(Long price) {
    this.price = price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Commodity toCommodity() {
    Commodity commodity = new Commodity();
    commodity.setBrand(this.brand);
    commodity.setCategory(this.category);
    commodity.setCreator(this.creator);
    commodity.setEffect(this.effect);
    commodity.setId(this.id);
    commodity.setName(this.name);
    commodity.setPrice(this.price);

    return commodity;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   commodity  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Commodity updateCommodity(Commodity commodity) {
    commodity.setPrice(this.price);
    commodity.setCategory(this.category);

    return commodity;
  }
} // end class CommodityCommand
