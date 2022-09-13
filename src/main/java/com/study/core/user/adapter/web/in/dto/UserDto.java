package com.study.core.user.adapter.web.in.dto;

import lombok.Builder;
import lombok.Getter;

public class UserDto {

  @Getter
  @Builder
  public static class createUserDto {

    private final String userId;
    private final String userPw;
  }
}
