package com.example.loginpage.services;

import com.example.loginpage.models.UserModel;
import com.example.loginpage.repositorys.DBManager;

import java.sql.*;

public class UserService {

  public UserModel getUser(String mySQL) {
    try {

      Connection con = DBManager.getConnection();
      PreparedStatement ps = con.prepareStatement(mySQL);
      ResultSet rs = ps.executeQuery();
      UserModel user;
      if (rs.next()) {
        user = new UserModel(
            rs.getInt(1), // ID
            rs.getString(2), // username
            rs.getString(3), // firstname
            rs.getString(4), // lastname
            rs.getString(5), // Email
            rs.getString(6), // password
            rs.getInt(7)); // Is signed in (0 = false, 1 = true)
        return user;
      }

    } catch (SQLException e) {
      System.out.println(e.getMessage());

    }

    return null;
  }

  public UserModel sendToUser(String mySQL) {
    try {
      Connection con = DBManager.getConnection();
      Statement statement = con.createStatement();
      statement.executeUpdate(mySQL);

    } catch (SQLException e) {
      System.out.println(e.getMessage());

    }

    return null;
  }

}
