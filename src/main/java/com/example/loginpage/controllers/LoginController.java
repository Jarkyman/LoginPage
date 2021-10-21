package com.example.loginpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  // Index, load site
  @GetMapping("/")
  public String index() {
    return "index";
  }

  // Load login page
  @GetMapping("/login")
  public String login() {
    return "windows/login/login-page";
  }

  // Load home page
  @GetMapping("/home")
  public String home() {
    return "windows/home/home-page";
  }

}
