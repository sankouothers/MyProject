package org.wang.restmall.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import org.wang.restmall.model.Address;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   consumerId  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  Set<Address> findByConsumerId(Long consumerId);

}
