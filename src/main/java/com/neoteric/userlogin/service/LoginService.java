package com.neoteric.userlogin.service;

import com.neoteric.userlogin.model.Login;
import com.neoteric.userlogin.model.LoginDetails;

public class LoginService {
    static int l=0;
    public String getLogged(LoginDetails login){
       // LoginDetails loginDetails = new LoginDetails();
        String savedUserName = "Chandra";
        String savedPassword = "Chandra@";
        //if(savedPassword.equals( login.passWord)&& (savedUserName.equals(login.userName))){
         //   return "Login successful";


                if(savedPassword.equals( login.passWord)&& (savedUserName.equals(login.userName))) {

                    return "Login successful";

                }else{
                    l++;
                    if(l>4) {
                        return "account is blocked";
                    }
                    return "Login Unsuccessful";
            }
        }

    }
