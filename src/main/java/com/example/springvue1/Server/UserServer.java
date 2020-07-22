package com.example.springvue1.Server;


import com.example.springvue1.Dao.UserMapper;
import com.example.springvue1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServer {
@Autowired
    private UserMapper userMapper;
public List <User> ss(Integer a){
    return userMapper.selectByAll((a-1)*10);
}

    public int delectUser(String listid) {
         return userMapper.deleteByPrimaryKey(Byte.valueOf(listid));
    }

    public Integer selectye() {
    return userMapper.selectye();
    }
}
