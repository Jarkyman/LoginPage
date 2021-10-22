package com.example.loginpage.services;

import com.example.loginpage.models.UserModel;

public class LoginService {
  UserModel user;
  UserService us = new UserService();

  public boolean checkAccount(String username, String password) {
    user = us.getUser("SELECT * FROM users WHERE username like \"" + username + "\" && userPassword like \""+ password +"\";");
    if (user != null) {
      signIn(username);
    }
    return user != null;
  }

  public boolean checkLogin(String username, String password) {
    user = us.getUser("SELECT * FROM users WHERE username like \"" + username + "\" && userPassword like \"" + password + "\" && userSignin like \"1\";");

    return user != null;
  }

  private void signIn(String username) {
    user = us.sendToUser("UPDATE `users` SET `userSignin` = '1' WHERE (`username` = '" + username + "');");
  }

  private void signOut(String username) {
    user = us.sendToUser("UPDATE `users` SET `userSignin` = '0' WHERE (`username` = '" + username + "');");
  }




}
