package com.example.demo.entity;

/**
 * Created by william.luo on 9/18/2017.
 */

import javax.persistence.Entity;

/**
 * TODO: More fields to add later
 * - DOB with calendar picker
 * - Phone number
 * - Security question
 * - Security answer
 */
@Entity
public class Account {
    private String userName;
    private String passWord;
    private String email;

    public Account(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public Account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
