package com.example.lab3.Part1;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
UserService userService;
  @GetMapping("/registerUser/{name}/{email}")
        public String Register(@PathVariable String name, @PathVariable String email){

      userService.registerUser(name, email);
           return "It worked";

  }

}
