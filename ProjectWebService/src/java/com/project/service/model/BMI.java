/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.service.model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Hilmy
 */
public class BMI extends MyModel{
    private int bmi;
    private String classification;
    private double bmi_value;
    private double height;
    private double weight;
    private double age;
    private String gender;
    private Date date;
    private int user_id;

    public int getBmi() {
        return bmi;
    }
    
    public BMI(Date date, double height, double weight, double bmi_value, String classficiation){
        this.date = date;
        this.height = height;
        this.weight = weight;
        this.bmi_value = bmi_value;
        this.classification = classficiation;
    }
    
   public BMI(){
       
    }
    
    

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public double getBmi_value() {
        return bmi_value;
    }

    public void setBmi_value(double bmi_value) {
        this.bmi_value = bmi_value;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    public String insert(String classification, double bmi, double height, double weight, double user_id){
        String status = "gagal";
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("INSERT INTO bmi(classification, bmi_value, height, weight, user_id) VALUES ('" + classification + "', '" + bmi + "', '" + height + "', '" + weight + "', '" + user_id + "');");
                sql.executeUpdate();
                sql.close();
                status = "berhasil";
            }
        } catch (Exception e) {
            System.out.println("Error di INSERT BMI: " + e);
            status = "gagal";
        }
        return status;
    }
    
    
    public String calculateClassification(double bmi){
        String klasifikasi = "";
        if (bmi >= 30) {
            klasifikasi = "Obesity";
        } else if (bmi >= 25 && bmi < 30) {
            klasifikasi = "Overweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            klasifikasi = "Healthy Weight";
        } else {
            klasifikasi = "Underweight";
        }
        return klasifikasi;
    }
    
    // it's work !
     public ArrayList<String> viewListData(int iduser) {
        ArrayList<String> collections = new ArrayList<>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("Select * from bmi where user_id=" + iduser + ";");
            while (this.result.next()) {
                // pengulangan buat ambil data : 
                String strDate = this.result.getDate("date").toString();  
                
                String tempv = 
                        strDate + "~" +
                        String.valueOf(this.result.getDouble("weight")) +"~" +
                        String.valueOf(this.result.getDouble("height")) +"~" +
                        String.valueOf(this.result.getDouble("bmi_value")) +"~" +
                        String.valueOf(this.result.getString("classification"));
                collections.add(tempv);
            }
        } catch (Exception e) {
            System.out.println("errornya di viewList method: " + e);
        }
        return collections;
    }
}
