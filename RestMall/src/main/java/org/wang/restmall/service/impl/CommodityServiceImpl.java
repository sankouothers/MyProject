package org.wang.restmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.restmall.model.Commodity;
import org.wang.restmall.repository.CommodityRepository;
import org.wang.restmall.service.CommodityService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Service @Transactional public class CommodityServiceImpl implements CommodityService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired CommodityRepository commodityRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.CommodityService#delete(org.wang.restmall.model.Commodity)
   */
  @Override public void delete(Commodity commodity) {
    commodityRepository.delete(commodity);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.CommodityService#findOne(java.lang.Long)
   */
  @Override public Commodity findOne(Long id) {
    return commodityRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.CommodityService#save(org.wang.restmall.model.Commodity)
   */
  @Override public void save(Commodity commodity) {
    commodityRepository.save(commodity);
  }

} // end class CommodityServiceImpl
