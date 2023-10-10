package com.example.lab3.Part2;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {
UserService userService;

  @GetMapping("/registerUser/{name}/{email}")
        public String Register(@PathVariable String name, @PathVariable String email){

      userService.registerUser(name, email);
           return "It worked";
  }

  @PostMapping("/register")
    public String Register2(@RequestBody User user){
      userService.registerUser(user.getUsername(), user.getEmail());
      return "It worked";
  }

}
