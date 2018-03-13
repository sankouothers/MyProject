package org.wang.restmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.restmall.model.Indent;
import org.wang.restmall.repository.IndentRepository;
import org.wang.restmall.service.IndentService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Service @Transactional public class IndentServiceImpl implements IndentService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired IndentRepository indentRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.IndentService#delete(org.wang.restmall.model.Indent)
   */
  @Override public void delete(Indent indent) {
    indentRepository.delete(indent);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.IndentService#findOne(java.lang.Long)
   */
  @Override public Indent findOne(Long id) {
    return indentRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.restmall.service.IndentService#save(org.wang.restmall.model.Indent)
   */
  @Override public void save(Indent indent) {
    indentRepository.save(indent);
  }
} // end class IndentServiceImpl
