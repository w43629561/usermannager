package com.wy.service;

import com.wy.dao.UserDao;
import com.wy.javabean.User;

public class UserService {
    public void saveUser(User user) {
        if (user != null) {
            UserDao ud = new UseDao();
            int row = ud.saveUser(user);
            return row > 0?true:false;
        }
        return false;
    }
}
