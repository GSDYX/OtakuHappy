package com.gsdyx.otakuhappy.web.controller;

import com.gsdyx.otakuhappy.service.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CartoonController {
    @Autowired
    private CartoonService cartoonService;

    @ResponseBody
    @RequestMapping("/cartoon")
    public List getCartoonDetails() {
        return cartoonService.getCartoonDetails();
    }
}
