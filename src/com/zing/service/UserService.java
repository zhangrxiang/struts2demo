package com.zing.service;

/**
 * Created by zhang on 2016/12/29.
 */
public class UserService {
    public boolean login(String username, String password) {
        return "zing".equals(username) && "zing".equals(password);
    }
}
