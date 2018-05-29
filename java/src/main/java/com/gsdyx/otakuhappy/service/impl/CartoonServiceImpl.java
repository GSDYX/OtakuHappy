package com.gsdyx.otakuhappy.service.impl;

import com.gsdyx.otakuhappy.mapper.CartoonMapper;
import com.gsdyx.otakuhappy.pojo.Cartoon;
import com.gsdyx.otakuhappy.service.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CartoonServiceImpl implements CartoonService {
    @Autowired
    private CartoonMapper cartoonMapper;
    @Override
    public List getCartoonDetails() {
        List<Cartoon> cartoonList = cartoonMapper.selectByExample(null);
        return cartoonList;
    }
}
