package com.springweb.miniWeb.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

   public List<User> getUsers() {
      return List.of(
            new User(
                  1L,
                  "Hyeon Min",
                  "Shin",
                  "gusals121234@gamil.com",
                  LocalDate.of(1999, Month.JULY, 13),
                  22));
   }
}