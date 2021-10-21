package com.example.loginpage.controllers;

import com.example.loginpage.repositorys.DBManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;

@Controller
public class IndexController {

  // Index, load site
  @GetMapping("/")
  public String index() {
    Connection connection = DBManager.getConnection();

    if (connection != null) {
      return "index";
    } else {
      return "No Connection";
    }
  }

}
