package org.wang.restmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.restmall.model.User;
import org.wang.restmall.repository.UserRepository;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Service @Transactional public class UserServiceImpl implements UserService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserRepository userRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.UserService#findAll()
   */
  @Override public List<User> findAll() {
    return (List<User>) userRepository.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  UserService#findByName(String)
   */
  @Override public User findByName(String name) {
    return userRepository.findByName(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.UserService#findOne(java.lang.Long)
   */
  @Override public User findOne(Long id) {
    return userRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.UserService#saveUser(org.wang.restmall.model.User)
   */
  @Override public User saveUser(User user) {
    return userRepository.save(user);
  }

} // end class UserServiceImpl
