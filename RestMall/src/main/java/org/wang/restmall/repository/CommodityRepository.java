package org.wang.restmall.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import org.wang.restmall.model.Commodity;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface CommodityRepository extends CrudRepository<Commodity, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   creatorId  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  Set<Commodity> findByCreatorId(Long creatorId);
}
