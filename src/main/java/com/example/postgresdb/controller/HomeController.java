package com.example.postgresdb.controller;


import com.example.postgresdb.models.TestUser;
import com.example.postgresdb.repo.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Autowired
  UserRepo userRepo;

  @GetMapping("/users")
  public List<TestUser> getUser(){
    return  userRepo.findAll();
  }


  @PostMapping("/users")
  public TestUser saveUser(@RequestBody TestUser user){
    return (TestUser) userRepo.save(user);
  }


  @DeleteMapping("/users/{id}")
  public Boolean saveUser(@PathVariable Long id){
     userRepo.deleteById(id);
     return true;
  }

}
