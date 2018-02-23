package org.wang.restmall.repository;

import org.springframework.data.repository.CrudRepository;

import org.wang.restmall.model.User;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface UserRepository extends CrudRepository<User, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   name  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  User findByName(String name);
}
