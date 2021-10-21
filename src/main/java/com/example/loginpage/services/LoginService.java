package com.example.loginpage.services;

import com.example.loginpage.models.UserModel;

public class LoginService {
  UserModel user;
  UserService us = new UserService();

  public boolean checkAccount(String username, String password) {
    user = us.getUser("SELECT * FROM users WHERE username like \"" + username + "\" && userPassword like \""+ password +"\";");

    return user != null;
  }




}
