package com.dedazazay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public String allUsers() {
        return "/list";
    }

    @GetMapping("/{id}")
    public String oneUser(int id) {
        return "/show";
    }

    @GetMapping("/new")
    public String newUser(/* User user */) {
        return "/new";
    }

    @PostMapping()
    public String createUser(/* User user */) {
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String editUser(/* fields of User */) {
        return "/edit";
    }

    @PatchMapping("/{id}")
    public String updateUser(/* some fields */) {
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser() {
        return "redirect:/users";
    }
}
