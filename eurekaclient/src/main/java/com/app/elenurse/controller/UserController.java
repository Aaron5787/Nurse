package com.app.elenurse.controller;


import com.app.elenurse.domain.User;
import com.app.elenurse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/queryAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }
}
