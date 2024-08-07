package com.MultigenesysTask.BackendTask.Service;

import com.MultigenesysTask.BackendTask.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImp implements UserService{

    List list=new ArrayList<>();
    public List<User> getAllUser(){
        User user1=new User(1,"amolbhosale","amol@gmail.com");
        User user2=new User(2,"yogirajkulkarni","yogiraj@gmail.com");
        User user3=new User(3,"pramolbhosale","pramol@gmail.com");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
