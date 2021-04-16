package com.yidu.ssmdemo003.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserCotroller {
    @RequestMapping("registry")
    @ResponseBody
    public  String  registry(String userName,String userPass){
        System.out.println("userName = " + userName + ", userPass = " + userPass );
        return "注册成功！ userName = " + userName + ", userPass = " + userPass;
    }

    @RequestMapping("login")
    @ResponseBody
    public  String login(String userName,String userpass){
        System.out.println("userName = " + userName + ", userpass = " + userpass);

        return "登陆成功！userName = " + userName + ", userpass = " + userpass ;
    }
    public void test(){
        System.out.println("ok");
    }
            {

    }
}
