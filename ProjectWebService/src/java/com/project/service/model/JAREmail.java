/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.service.model;


import java.sql.*;
import com.project.service.model.JAREmail;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Pootish2 haha
 */
public class JAREmail {
    
    public static String email;
    public static String username;
    
    public static String SendMail(String recepient) throws Exception {
        String status = "berhasil";
        System.out.println("Preparing to send email!");
        Properties prop = new Properties();
        
        // Pengaturan email
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        // Email dan password asal
        String myEmailAcc = "jar.disprog@gmail.com";
        String password = "qbjwwttbmlleimua";   // pass in adalah pass app, bukan pass email

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmailAcc, password);
            }
        });
        Message message = prepareMessage(session, myEmailAcc, recepient);
        
        Transport.send(message);
        System.out.println("Message sent successfully!");
        return status;
    }
    
    private static Message prepareMessage(Session session, String myEmailAcc, String recepient){
        try 
        {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myEmailAcc));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient)); // Penerima merupakan parameter
           
            
            int kode = 0;
            JAREmail jar = new JAREmail();
            kode = jar.inputKodeUnik(recepient);
            
            
            // Pesan dikirim
            message.setSubject("JAR App Password Reset Request");
            message.setText("HI " + username + "~!"
                            + "\n Here is the password reset code you requested: "
                            + "\n -'" + kode + "'-"
                            + "\nContact support immediately, if you did not make this request.");
            return message;
        } catch (MessagingException ex) 
        {
            System.out.println("Error Message = " + ex);
        }
        return null;
    }
    
    
    public int inputKodeUnik(String email){
           // kode
            int min = 111111;
            int max = 999999;
            
            int kode = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(kode);
            
        try {
            if (!MyModel.conn.isClosed()) {
                Statement sqlData = (Statement) MyModel.conn.createStatement();
                ResultSet rsData = sqlData.executeQuery("SELECT * FROM verif where email='" + email + "';");
                if (rsData.next()) {
                    PreparedStatement sqlKode1 = (PreparedStatement) MyModel.conn.prepareStatement("DELETE FROM `verif` where email='" + email + "';");
                    sqlKode1.executeUpdate();
                    System.out.println(sqlKode1);
                    
                    PreparedStatement sqlKirimKode = (PreparedStatement) MyModel.conn.prepareStatement("INSERT INTO verif (email, kodeUnik) VALUES (?,?);");
                    sqlKirimKode.setString(1, email);
                    sqlKirimKode.setInt(2, kode);
                    sqlKirimKode.executeUpdate();
                    sqlKirimKode.close();
                    System.out.println("Berhasil dihapus data emailnya + dikirim kodenya");
                } else{
                     PreparedStatement sqlKirimKode = (PreparedStatement) MyModel.conn.prepareStatement("INSERT INTO verif (email, kodeUnik) VALUES (?,?);");
                    sqlKirimKode.setString(1, email);
                    sqlKirimKode.setInt(2, kode);
                    sqlKirimKode.executeUpdate();
                    sqlKirimKode.close();
                    System.out.println("Datanya tidak duplikate + dikirim kodenya");
                }
            }
        } catch (Exception e) {
            System.out.println("Error di inputKodeUnik: " + e);
        }
        return kode;
    }
    
    public String checkKode(String email, int Kode){
        String status = "gagal";
        try {
            if (!MyModel.conn.isClosed()) {
                Statement sql = (Statement) MyModel.conn.createStatement();
                ResultSet rs = sql.executeQuery("SELECT * FROM verif where email ='" + email +"' and kodeUnik='" + Kode + "';");
                if(rs.next()) {
                   status ="berhasil";
                }
            }
        } catch (Exception e) {
            System.out.println("Error di cekDuplikatEmail: " + e);
        }
        return status;
    }
}
