package org.wang.restmall.service;


import org.wang.restmall.model.Commodity;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface CommodityService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  commodity  DOCUMENT ME!
   */
  void delete(Commodity commodity);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  Commodity findOne(Long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  commodity  DOCUMENT ME!
   */
  void save(Commodity commodity);

} // end interface CommodityService
