package com.MultigenesysTask.BackendTask.Service;

import com.MultigenesysTask.BackendTask.Entity.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UserServiceImpTest {
    List list=new ArrayList<>();
    @Test

    public List<User> getAllUser(){
        User user1=new User(1,"amolbhosale","amol@gmail.com");
        User user2=new User(2,"yogirajkulkarni","yogiraj@gmail.com");
        User user3=new User(3,"pramolbhosale","pramol@gmail.com");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println("userName"+user1.getUserName());
        return list;
    }

}

//UserServiceImpTest