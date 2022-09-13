package com.study.core.user.adapter.web.in;

import com.study.core.user.application.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
class UserControllerTest {

  @Autowired
  private MockMvc MockMvc;

  @MockBean
  private UserService userService;

  @Test
  void registerUser() {
  }

  @Test
  void getUser() {
  }

  @Test
  void updateUser() {
  }

  @Test
  void removeUser() {
  }
}