package com.fh.controller;

import com.fh.biz.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userservice;

    @RequestMapping("queryList")
    @ResponseBody
    public String queryList(){

        System.out.println("");
        return userservice.queryList();
    }
	//³ô¼¦b
}
