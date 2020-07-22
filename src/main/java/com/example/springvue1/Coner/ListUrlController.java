package com.example.springvue1.Coner;


import com.example.springvue1.Server.ListUrlServer;
import com.example.springvue1.pojo.ListUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.List;
@Controller
@ResponseBody
@CrossOrigin

public class ListUrlController {
@Autowired
private ListUrlServer listUrlServer;
@RequestMapping("/List")
    public List<ListUrl> listUrlList(){
        return listUrlServer.selectbylist();
    }
}
