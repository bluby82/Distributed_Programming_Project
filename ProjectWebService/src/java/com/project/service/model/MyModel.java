/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.service.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RYAN
 */
public class MyModel {

    //create connection library
    protected static Connection conn;
    protected Statement statement;
    protected ResultSet result;

    public MyModel() {
        this.statement = null;
        this.result = null;
        this.conn = this.getConnection();
    }

    private Connection getConnection() {

        if (MyModel.conn == null) {
            try {
                Class.forName(
                        "com.mysql.cj.jdbc.Driver").newInstance();
                return DriverManager.getConnection("jdbc:mysql://localhost/bmicalculator", "root", "");
            } catch (Exception e) {
                System.out.println("Error di getConnection: " + e);
            }
        }

        return MyModel.conn;

    }
}
