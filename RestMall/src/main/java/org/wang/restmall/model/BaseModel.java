package org.wang.restmall.model;

import java.util.Date;

import javax.persistence.Column;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class BaseModel {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(
    nullable  = false,
    updatable = false
  )
  private Date createDate;

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
   * @param  createDate  DOCUMENT ME!
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

} // end class BaseModel
