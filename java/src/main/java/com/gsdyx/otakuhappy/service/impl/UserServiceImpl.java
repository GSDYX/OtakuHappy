package com.gsdyx.otakuhappy.service.impl;

import com.gsdyx.otakuhappy.mapper.UserMapper;
import com.gsdyx.otakuhappy.pojo.User;
import com.gsdyx.otakuhappy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<String> getUserName() {
        List<User> users = userMapper.selectByExample(null);
        List<String> userNames = new ArrayList<>();
        for (User user:users) {
            userNames.add(user.getUsername());
        }
        return userNames;
    }
}
