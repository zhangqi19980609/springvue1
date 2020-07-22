package com.example.springvue1.Server;

import com.example.springvue1.Dao.ListUrlMapper;
import com.example.springvue1.pojo.ListUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListUrlServer {
    @Autowired
    private ListUrlMapper listUrlMapper;
    public List<ListUrl> selectbylist() {
        return listUrlMapper.selectbylistUrl();
    }
}
