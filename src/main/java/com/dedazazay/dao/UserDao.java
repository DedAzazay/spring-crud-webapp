package com.dedazazay.dao;

import com.dedazazay.model.User;

import java.util.List;

public interface UserDao {
    List<User> list();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
