package com.springweb.miniWeb.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

   private final UserService userService;

   @Autowired
   public UserController(UserService userService) {
      this.userService = userService;
   }

   @GetMapping
   public List<User> getUsers() {
      return userService.getUsers();
   }
}