package com.training.trainningSpring.models;

import lombok.Data;

@Data
public class User {
    private String nickName;
    private String username;
    private String password;

    public User(String nickName, String username, String password) {
        this.nickName = nickName;
        this.username = username;
        this.password = password;
    }
}


