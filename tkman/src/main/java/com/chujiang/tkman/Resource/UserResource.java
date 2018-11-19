package com.chujiang.tkman.Resource;

import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yanggang 2018/10/23.
 */
@Controller
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/userMessage")
    public String queryUserMessage(){

        return "userMessage";
    }


}
