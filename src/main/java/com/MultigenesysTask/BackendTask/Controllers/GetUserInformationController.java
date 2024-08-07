package com.MultigenesysTask.BackendTask.Controllers;


import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class GetUserInformationController {
    @GetMapping("/userName")
    public String getUserName(Principal principal){
        return principal.getName();
    }
}
