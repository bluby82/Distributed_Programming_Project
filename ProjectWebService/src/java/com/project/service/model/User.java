/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.service.model;

import com.project.service.model.JAREmail;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

// Untuk hashing....

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author RYAN
 */
public class User extends MyModel {

    JAREmail jar;
    public int id;
    public String username;
    public String email;
    public String password;

    public User() {

    }

    public User(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
    }

    public User(String username, String email, String password) {
        this.setUsername(username);
        this.setEmail(email);
        this.setPassword(password);
    }

    public User(int id, String username, String email, String password) {
        this.setId(id);
        this.setUsername(username);
        this.setEmail(email);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // buat login
    public String cekLogin(String email, String password) {
        String a = null;
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("SELECT user_id, username FROM user WHERE email = '" + email + "' AND password = '" + password + "';");
            while (this.result.next()) {
                a = String.valueOf(this.result.getInt("user_id")) + "~" +
                        this.result.getString("username");
            }
        } catch (Exception e) {
            System.out.println("Error di cekLogin: " + e);
        }
        return a;
    }

    // buat registrasi
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("INSERT INTO user (username, email, password) VALUES (?, ?, ?);");
                sql.setString(1, this.username);
                sql.setString(2, this.email);
                sql.setString(3, this.password);
                sql.executeUpdate();
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error di insertData: " + e);
        }
    }

    public String cekDuplikatEmail(String newEmail) {
        ArrayList<String> emails = new ArrayList<>();
        String status = "berhasil";
        try {
            if (!MyModel.conn.isClosed()) {
                this.statement = (Statement) MyModel.conn.createStatement();
                this.result = this.statement.executeQuery("SELECT email FROM user;");
                while (this.result.next()) {
                    emails.add(this.result.getString("email"));
                }
                for (String em : emails) {
                    if (newEmail.equals(em)) {
                        status = "gagal";
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error di cekDuplikatEmail: " + e);
        }
        return status;
    }

    public ArrayList<String> allUserExceptBlock(String id) {
        ArrayList<String> arrayUser = new ArrayList<>();
        try {
            if (!MyModel.conn.isClosed()) {
                this.statement = (Statement) MyModel.conn.createStatement();
                this.result = this.statement.executeQuery("SELECT user_id, username FROM user WHERE user_id!= " + id + " AND user_id!=ALL(SELECT bd.blocked_id FROM blockdetails bd INNER JOIN user u ON u.user_id = bd.user_id WHERE u.user_id =" + id + ");");
                while (this.result.next()) {
                    arrayUser.add(this.result.getString("username") + "#" + String.valueOf(this.result.getInt("user_id")));
                }
            }
        } catch (Exception e) {
            System.out.println("Error di cekBlokir: " + e);
        }
        return arrayUser;
    }

    public String blockUser(int id, int idBlock) {
        String status = "gagal";
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("INSERT INTO blockdetails (user_id, blocked_id) VALUES (?, ?);");
                sql.setInt(1, id);
                sql.setInt(2, idBlock);
                sql.executeUpdate();
                sql.close();
                status = "berhasil";
            }
        } catch (Exception e) {
            System.out.println("Error di blockUser: " + e);
            status = "gagal";
        }
        return status;
    }

    public ArrayList<String> cekBlokir(String id) {
        ArrayList<String> arrayBlocked = new ArrayList<>();
        try {
            if (!MyModel.conn.isClosed()) {
                this.statement = (Statement) MyModel.conn.createStatement();
                this.result = this.statement.executeQuery("SELECT bd.blocked_id FROM blockdetails bd INNER JOIN user u ON u.user_id = bd.user_id WHERE u.user_id =" + id + ";");
                while (this.result.next()) {
                    arrayBlocked.add(this.result.getString("bd.blocked_id"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error di cekBlokir: " + e);
        }
        return arrayBlocked;
    }

    public String getUsernameById(int id) {
        String stringId = "";
        try {
            if (!MyModel.conn.isClosed()) {
                this.statement = (Statement) MyModel.conn.createStatement();
                this.result = this.statement.executeQuery("SELECT username FROM user WHERE user_id =" + id + ";");
                while (this.result.next()) {
                    stringId = this.result.getString("username");
                }
            }
        } catch (Exception e) {
            System.out.println("Error di getUsernameById: " + e);
        }
        return stringId;
    }

    public String unblockUser(int id, int idBlock) {
        String status = "gagal";
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("DELETE FROM blockdetails WHERE user_id = " + id + " AND blocked_id = " + idBlock + ";");
                sql.executeUpdate();
                sql.close();
                status = "berhasil";
            }
        } catch (Exception e) {
            System.out.println("Error di unblockUser: " + e);
            status = "gagal";
        }
        return status;
    }
    
      public String verifEmail(String newEmail) {
        String status = "berhasil";
        String username;
        try {
            if (!MyModel.conn.isClosed()) {
                this.statement = (Statement) MyModel.conn.createStatement();
                String sql = "SELECT * FROM user where email= '" + newEmail + "';";
                System.out.println(sql);
                this.result = this.statement.executeQuery(sql);
                if (this.result.next()) {
                    System.out.println("Email ada dan dikirim");
                    username = this.result.getString("username");
                    jar = new JAREmail();
//                    jar.username = username;
//                    jar.SendMail(newEmail);
                }else
                {
                    System.out.println("emailnya ndak ada");
                    status ="gagal";
                }
            }
        } catch (Exception e) {
            System.out.println("Error di verifikasiEmail: " + e);
        }
        return status;
    }
      
      public String ubahPassword(String email, String newPass){
          String status = "succes";
          try {
                        if (!MyModel.conn.isClosed()) {
            String test = ("UPDATE `user` SET `password`='" + newPass + "' where email= '" + email + "';");
            PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("UPDATE `user` SET `password`='" + newPass + "' where email= '" + email + "';");
            System.out.println(test);
            sql.executeUpdate();
            sql.close();
          } 
          } catch (Exception e) {
          }
          return status;
      }
      
      
      // Java program to calculate SHA hash value
 
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // getInstance dipanggil sehingga diketahui kita gunakan SHA-512
        MessageDigest md = MessageDigest.getInstance("SHA-512");
 
        // digest() dipanggil
        // untuk mengitung msg digest oleh input
        // mengembalikan array byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }
     
    public static String toHexString(byte[] hash)
    {
        // Konversi byte array dari getSHA ke signum
        BigInteger number = new BigInteger(1, hash);
 
        // Konversi signum tadi ke hexadecimal
        StringBuilder hexString = new StringBuilder(number.toString(16));
 
        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
        
        // Kembalikan hasil hash, dari hexaString ke string biasa
        return hexString.toString();
    }
 
      
      
}
