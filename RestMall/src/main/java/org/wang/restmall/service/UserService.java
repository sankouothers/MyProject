package org.wang.restmall.service;

import org.wang.restmall.model.User;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface UserService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   name  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  User findByName(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  User findOne(Long id);
}
