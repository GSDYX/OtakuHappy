package com.gsdyx.otakuhappy.web.controller;

import com.gsdyx.otakuhappy.pojo.Cartoon;
import com.gsdyx.otakuhappy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findCartoon")
    @ResponseBody
    public List<Cartoon> findCartoonListByUser(String uuid ) {
//        根据uuid查询用户open获得userId,先模拟出userId
        int userId=1;
        List<Cartoon> cartoonLists = userService.findCartoonListByUserId(userId);
        return cartoonLists;
    }
}
