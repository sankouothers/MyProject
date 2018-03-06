package org.wang.restmall.controller;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.wang.restmall.service.UserService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class UserControllerTest extends BaseControllerTest {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @throws  Exception  DOCUMENT ME!
   */
  @Test public void createUser() throws Exception {
    //J-
    mockMvc.perform(post("/user")
        .param("name","li si")
        .param("passWord","wang123")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED))
        .andExpect(status().isOk());
    //J+
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @throws  Exception  DOCUMENT ME!
   */
  @Test public void userList() throws Exception {
    //J-
    mockMvc.perform(get("/user"))
        .andExpect(jsonPath("$[2].id", is(equalTo(3))))
        .andExpect(jsonPath("$[2].name", is(equalTo("san kou"))))
        .andExpect(jsonPath("$[2].passWord", is(equalTo("P123456"))))
        .andExpect(status().isOk());
    //J+
  }

} // end class UserControllerTest
