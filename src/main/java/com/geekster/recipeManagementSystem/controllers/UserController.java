package com.geekster.recipeManagementSystem.controllers;


import com.geekster.recipeManagementSystem.models.User;
import com.geekster.recipeManagementSystem.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping()
    public void addUser(@RequestBody User user){
        userService.insertUser(user);
    }
  @GetMapping()
    public String test(){
        return "testing api recipie";
  }
    @DeleteMapping (value = "/deleteUser/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userService.removeUserById(id);
    }

}
