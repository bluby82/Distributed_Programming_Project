/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.service;

import com.project.service.model.BMI;
import com.project.service.model.JAREmail;
import com.project.service.model.User;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author RYAN
 */
@WebService (serviceName = "ProjectWebService")
public class ProjectWebService {
    
    BMI bmi;
    User user;
    JAREmail jar;
    
    @WebMethod(operationName = "CheckLogin")
    public String CheckLogin(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        String hasil = "";
        User acc = new User();
        hasil += acc.cekLogin(email, password);
        return hasil;
    }

    @WebMethod(operationName = "Register")
    public String Register(@WebParam(name = "username") String username,@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        String status = "";
        User newAccount = new User();
        int statusDuplikat = 0;

        String e = newAccount.cekDuplikatEmail(email);
        
        if (e.equals("gagal")) {
            statusDuplikat = 1;
        }

        if (statusDuplikat == 1) {
            status = "emailDuplikat";
        } else {
            newAccount = new User(username, email, password);
            newAccount.insertData();
            status = "Registrasi berhasil";
        }
        return status;
    }
    
    @WebMethod(operationName = "CheckBlokir")
    public ArrayList<String> CheckBlokir(@WebParam(name = "id") String id) {
        User acc = new User();
        ArrayList<String> hasil = acc.cekBlokir(id);
        return hasil;
    }
    
    @WebMethod(operationName = "GetAllUsersExceptBlock")
    public ArrayList<String> GetAllUsersExceptBlock(@WebParam(name = "id") String id) {
        User acc = new User();
        ArrayList<String> hasil = acc.allUserExceptBlock(id);
        return hasil;
    }
    
    @WebMethod(operationName = "BlockUser")
    public String BlockUser(@WebParam(name = "id") String id, @WebParam(name = "idBlock") String idBlock) {
        User acc = new User();
        int intId = Integer.parseInt(id);
        int intIdBlock = Integer.parseInt(idBlock);
        String hasil = acc.blockUser(intId, intIdBlock);
        return hasil;
    }
    
    @WebMethod(operationName = "UnblockUser")
    public String UnblockUser(@WebParam(name = "id") String id, @WebParam(name = "idBlock") String idBlock) {
        User acc = new User();
        int intId = Integer.parseInt(id);
        int intIdBlock = Integer.parseInt(idBlock);
        String hasil = acc.unblockUser(intId, intIdBlock);
        return hasil;
    }
    
    @WebMethod(operationName = "CalculateClassification")
    public String CalculateClassification(@WebParam(name = "bmi") double bmi) {
        BMI newBMI = new BMI();
        String hasil = newBMI.calculateClassification(bmi);
        return hasil;
    }
    
    @WebMethod(operationName = "InsertBMI")
    public String InsertBMI(@WebParam(name = "classification") String classification, @WebParam(name = "bmi") double bmi, @WebParam(name = "height") double height, @WebParam(name = "weight") double weight, @WebParam(name = "id") String id) {
        BMI newBMI = new BMI();
        double idDouble = Double.parseDouble(id);
        String hasil = newBMI.insert(classification, bmi, height, weight, idDouble);
        return hasil;
    }
    
    @WebMethod(operationName = "GetUnameByID")
    public String GetUnameByID(@WebParam(name = "id") String id) {
        User acc = new User();
        String hasil = acc.getUsernameById(Integer.parseInt(id));
        return hasil;
    }

    @WebMethod(operationName = "viewListData")
    public ArrayList<String> viewListData(@WebParam(name = "id") String id) {
        BMI bmi = new BMI();
        ArrayList<String> hasil = bmi.viewListData(Integer.parseInt(id));
        return hasil;
    }

    @WebMethod(operationName = "verifyEmail")
    public String verifyEmail(@WebParam(name = "newEmail") String newEmail) {
        user = new User();
        return user.verifEmail(newEmail);
    }

    
    @WebMethod(operationName = "changePassword")
    public String changePassword(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        user = new User();
        return user.ubahPassword(email, password);
    }

  
    @WebMethod(operationName = "checkCodeVerif")
    public String checkCodeVerif(@WebParam(name = "email") String email, @WebParam(name = "kode") int kode) {
    jar = new JAREmail();
        return jar.checkKode(email, kode);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSHA")
    public byte[] getSHA(@WebParam(name = "input") String input) throws NoSuchAlgorithmException {
        User akun = new User();
        return akun.getSHA(input);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "toHexString")
    public String toHexString(@WebParam(name = "hash") byte[] hash) {
        User account = new User();
        return account.toHexString(hash);
    }
}
