package com.gsdyx.otakuhappy.service.impl;

import com.gsdyx.otakuhappy.mapper.CartoonMapper;
import com.gsdyx.otakuhappy.pojo.Cartoon;
import com.gsdyx.otakuhappy.pojo.CartoonExample;
import com.gsdyx.otakuhappy.service.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CartoonServiceImpl implements CartoonService {
    @Autowired
    private CartoonMapper cartoonMapper;
    @Override
    public List getCartoonDetails(String weeks) {
        CartoonExample cartoonExample = new CartoonExample();
        CartoonExample.Criteria criteria = cartoonExample.createCriteria();
        criteria.andWeekplayEqualTo(weeks);
        List<Cartoon> cartoonList = cartoonMapper.selectByExample(cartoonExample);
        return cartoonList;
    }
}
