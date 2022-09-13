package com.study.core.user.application.service;

import com.study.core.user.application.port.in.UserUseCase;
import org.springframework.stereotype.Component;

@Component
public class UserService implements UserUseCase {

  public String registerUser() {
    return "ok";
  }

}
