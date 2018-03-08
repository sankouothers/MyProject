package org.wang.restmall.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.restmall.model.Address;
import org.wang.restmall.repository.AddressRepository;
import org.wang.restmall.service.AddressService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Service @Transactional public class AddressServiceImpl implements AddressService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired AddressRepository addressRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.AddressService#findByConsumerId(java.lang.Long)
   */
  @Override public Set<Address> findByConsumerId(Long consumerId) {
    return addressRepository.findByConsumerId(consumerId);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.AddressService#findOne(java.lang.Long)
   */
  @Override public Address findOne(Long id) {
    return addressRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.AddressService#saveAddress(org.wang.restmall.model.Address)
   */
  @Override public void saveAddress(Address address) {
    addressRepository.save(address);
  }
} // end class AddressServiceImpl
