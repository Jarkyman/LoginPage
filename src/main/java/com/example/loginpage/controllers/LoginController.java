package com.example.loginpage.controllers;

import com.example.loginpage.services.LoginService;
import org.springframework.stereotype.Controller;
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
    ls.checkAccount(username, password);
    if (ls.checkLogin(username, password)) {
      return "windows/home/home-page";
    } else {
      return "index";
    }
  }

}
