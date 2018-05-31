package com.gsdyx.otakuhappy.service;

import com.gsdyx.otakuhappy.pojo.Cartoon;

import java.util.List;

public interface UserService {
    List<Cartoon> findCartoonListByUserId(int userId);
}
