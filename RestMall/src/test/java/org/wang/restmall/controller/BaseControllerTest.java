package org.wang.restmall.controller;

import org.junit.Before;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.springframework.web.context.WebApplicationContext;

import org.wang.restmall.RestmallApplication;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@RunWith(SpringRunner.class)

// 1.4 版本之前用的是SpringJUnit4ClassRunner.class
@SpringBootTest(classes = RestmallApplication.class)
// 1.4 版本之前用的是//@SpringApplicationConfiguration
public class BaseControllerTest {
  //~ Instance fields --------------------------------------------------------------------------------------------------


  /** DOCUMENT ME! */
  MockMvc mockMvc;

  /** DOCUMENT ME! */
  @Autowired WebApplicationContext webApplicationContext;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @throws  Exception  DOCUMENT ME!
   */
  @Before public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

}
