package com.dedazazay.services;

import com.dedazazay.model.User;

import java.util.List;

public interface UserServices {
    List<User> list();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
