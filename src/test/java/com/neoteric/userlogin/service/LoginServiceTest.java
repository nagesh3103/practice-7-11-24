package com.neoteric.userlogin.service;

import com.neoteric.userlogin.model.Login;
import com.neoteric.userlogin.model.LoginDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    public void successful() {
        LoginDetails loginDetails = new LoginDetails();
        loginDetails.userName = "Chandra";
        loginDetails.passWord = "Chandra@";
        LoginService service = new LoginService();
        String logInSuccess = service.getLogged(loginDetails);
        Assertions.assertEquals("Login successful", logInSuccess);
    }

//    @Test
//    public void unsuccessful() {
//        LoginDetails loginDetails = new LoginDetails();
//        loginDetails.userName = "Chandra";
//        loginDetails.passWord = "Incorrect Password";
//        LoginService service = new LoginService();
//        String logInFail="";
//        for (int i = 0; i <= 4; i++) {
//            logInFail = service.getLogged(loginDetails);
//        }
//            Assertions.assertEquals("Login Unsuccessful", logInFail);
//        }
    @Test
       // Assertions.assertEquals("Login Unsuccessful", logInFail);
        public void block() {
            LoginDetails loginDetails = new LoginDetails();
            loginDetails.userName = "Chandra";
            loginDetails.passWord = "Incorrect Password";
            LoginService service = new LoginService();
            String loginblock="";
            for (int i = 0; i <= 4; i++) {
                loginblock = service.getLogged(loginDetails);
            }
                Assertions.assertEquals("account is blocked", loginblock);

    }
}