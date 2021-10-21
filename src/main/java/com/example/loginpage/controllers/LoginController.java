package com.example.loginpage.controllers;

import com.example.loginpage.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

  // Load login page
  @GetMapping("/login")
  public String login() {
    return "windows/login/login-page";
  }

  @PostMapping("/home")
  public String loginConnect(String username, String password) {
    LoginService ls = new LoginService();
    if (ls.checkAccount(username, password)) {
      return "windows/home/home-page";
    } else {
      return "index";
    }
  }

}
