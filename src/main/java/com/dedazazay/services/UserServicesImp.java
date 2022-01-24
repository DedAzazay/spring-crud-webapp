package com.dedazazay.services;

import com.dedazazay.dao.UserDao;
import com.dedazazay.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServicesImp implements UserServices {

    private final UserDao userDao;

    @Autowired
    public UserServicesImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> list() {
         return userDao.list();
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }


    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
