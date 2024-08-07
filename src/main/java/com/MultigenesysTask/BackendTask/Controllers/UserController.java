package com.MultigenesysTask.BackendTask.Controllers;

import com.MultigenesysTask.BackendTask.Entity.User;
import com.MultigenesysTask.BackendTask.Service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/home")
public class UserController {
    @Autowired
    UserServiceImp userServiceImp;
    @GetMapping(path = "/users")
    public List<User> userDetails(){
       return userServiceImp.getAllUser();
    }
}
