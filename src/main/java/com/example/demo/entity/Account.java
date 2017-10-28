package com.example.demo.entity;

/**
 * Created by william.luo on 9/18/2017.
 */

import ch.qos.logback.classic.db.names.ColumnName;

import javax.persistence.*;

/**
 * TODO: More fields to add later
 * - DOB with calendar picker
 * - Phone number
 * - Security question
 * - Security answer
 */
@Entity
@Table(
        name="UserAccounts"
)
public class Account {
    // TODO add auto-generated-id, unique
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // provided by database
    private long UserId;
    @Column(name = "Username")
    private String userName;
    @Column(name = "Password")
    private String passWord;
    @Column(name = "Email")
    private String email;

    public Account() {
    }

    public Account(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public long getUserId() {
        return UserId;
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
