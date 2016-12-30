package com.zing.service;

import com.zing.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhang on 2016/12/29.
 */
public class UserService {
    public boolean login(String username, String password) {
        return "zing".equals(username) && "zing".equals(password);
    }
    public Map<String, User> getAllUser() {
        Map<String,User> maps = new HashMap<>();
        for (int i = 0; i < 100; i++){
            maps.put(""+i,new User("zing"+i, "password"+i));
        }
        return maps;
    }
}
