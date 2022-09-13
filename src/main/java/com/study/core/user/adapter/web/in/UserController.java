package com.study.core.user.adapter.web.in;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class UserController {

  public ResponseEntity registerUser() {

    return ResponseEntity.ok("");
  }


  public ResponseEntity getUser() {
    return ResponseEntity.ok("");
  }

  public ResponseEntity updateUser() {
    return ResponseEntity.ok("");
  }

  public ResponseEntity removeUser() {
    return ResponseEntity.ok("");
  }


  private String test(String t, Integer te, long test, Boolean bole) {
    return "test";
  }
}
