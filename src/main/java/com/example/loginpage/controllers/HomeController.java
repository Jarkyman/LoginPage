package com.example.loginpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  // Load home page
  @GetMapping("/home")
  public String home() {
    return "windows/home/home-page";
  }

}
