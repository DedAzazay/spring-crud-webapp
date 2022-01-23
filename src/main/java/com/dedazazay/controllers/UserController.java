package com.dedazazay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public String allUsers() {
        return null;
    }

    @GetMapping("/{id}")
    public String oneUser(int id) {
        return null;
    }

    @GetMapping("/new")
    public String newUser(/* User user */) {
        return null;
    }

    @PostMapping()
    public String createUser(/* User user */) {
        return null;
    }

    @GetMapping("/{id}/edit")
    public String editUser(/* fields of User */) {
        return null;
    }

    @PatchMapping("/{id}")
    public String updateUser(/* some fields */) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteUser() {
        return null;
    }
}
