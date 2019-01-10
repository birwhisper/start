package org.birwhisper.controller;

import org.birwhisper.mapper.UserMapper;
import org.birwhisper.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Servlet;
import java.util.List;

/**
 * @author: RenKeMuHua
 * @date: Created in 20:02 2019.1.7
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }
}
