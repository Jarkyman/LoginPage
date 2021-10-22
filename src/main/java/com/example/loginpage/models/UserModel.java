package com.example.loginpage.models;

public class UserModel {

  public UserModel(int userId, String username, String firstname, String lastname, String userEmail, String password, int userSignin) {
    this.userId = userId;
    this.username = username;
    this.firstname = firstname;
    this.lastname = lastname;
    this.userEmail = userEmail;
    this.password = password;
    this.userSignin = userSignin;
  }

  private final int userId;
  private final String username;
  private final String firstname;
  private final String lastname;
  private final String userEmail;
  private final String password;
  private final int userSignin;

  public int getUserId() {
    return userId;
  }

  public String getUsername() {
    return username;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public String getPassword() {
    return password;
  }

  public int getUserSignin() {
    return userSignin;
  }
}
