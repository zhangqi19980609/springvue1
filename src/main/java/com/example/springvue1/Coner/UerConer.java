package com.example.springvue1.Coner;

import com.example.springvue1.Server.UserServer;
import com.example.springvue1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
public class UerConer {

@Autowired
    private UserServer userServer;
@RequestMapping("/user")
public List<User> sa(@RequestParam String mes){
    System.out.println("传递过来的页数"+mes);
    return userServer.ss(Integer.valueOf(mes));
}
@RequestMapping("/delectuserall")
    public String aa(@RequestParam String listid){
    if(userServer.delectUser(listid)==1){
         return "删除成功";
    }else {
        return "失败";
    }
}
@RequestMapping("/yigong")
    public Integer yigong (){
        return userServer.selectye();
}

}
