package org.wang.restmall.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Entity
public class Commodity extends BaseModel {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(length = 50)
// 品牌
  private String brand;
  @Column(length = 50)
  // 分类
  private String category;

  @JoinColumn(name = "creatorId")
  @ManyToOne
// 商品属于谁
  private User                   creator;

  @Column(length = 50)
// 使用环境
  private String   effect;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;
  @Column(
    length   = 12,
    nullable = false
  )
// 商品名称
  private String   name;

  @Column(
    nullable = false,
    updatable = false
  )
// 单价
  private Long price;

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

} // end class Commodity
