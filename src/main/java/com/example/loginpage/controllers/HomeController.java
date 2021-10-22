package com.example.loginpage.controllers;

import com.example.loginpage.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
  LoginService ls = new LoginService();

  // Load home page
  @GetMapping("/home")
  public String home(String username, String password) {
    if (ls.checkLogin(username, password)) {
      return "windows/home/home-page";
    } else {
      return "index";
    }

  }

}
