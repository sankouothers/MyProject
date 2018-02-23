package org.wang.restmall.controller;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class UserControllerTest extends BaseControllerTest {
  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * DOCUMENT ME!
   *
   * @throws  Exception  DOCUMENT ME!
   */
  @Test public void userInfo() throws Exception {
    //J-
    mockMvc.perform(get("/user/{id}",1))
        .andExpect(jsonPath("$.name", is(equalTo("pin"))))
        .andExpect(jsonPath("$.id", is(equalTo(1))))
        .andExpect(status().isOk());
    //J+
  }

}
