package com.gsdyx.otakuhappy.service.impl;

import com.gsdyx.otakuhappy.mapper.UserCartoonMapper;
import com.gsdyx.otakuhappy.pojo.Cartoon;
import com.gsdyx.otakuhappy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserCartoonMapper userCartoonMapper;
    @Override
    public List<Cartoon> findCartoonListByUserId(int userId) {
        List<Cartoon> cartoonLists = userCartoonMapper.findCartoonListByUserId(userId);
        return cartoonLists;
    }
}
