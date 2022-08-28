package com.springweb.miniWeb.User;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class User {
   private long id;
   private String firstName, lastName;
   private String email;
   private LocalDate dob;
   private Integer age;

   @Builder(buildMethodName = "customerBuilder")
   public User(long id, String firstName, String lastName,String email, LocalDate dob, Integer age) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.dob = dob;
      this.age = age;
   }
}