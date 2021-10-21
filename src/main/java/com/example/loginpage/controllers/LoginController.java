package com.example.loginpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  // Load login page
  @GetMapping("/login")
  public String login() {
    return "windows/login/login-page";
  }

}
