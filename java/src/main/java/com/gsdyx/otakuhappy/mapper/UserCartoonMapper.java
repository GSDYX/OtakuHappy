package com.gsdyx.otakuhappy.mapper;

import com.gsdyx.otakuhappy.pojo.Cartoon;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("UserCartoonMapper")
public interface UserCartoonMapper {
    List<Cartoon> findCartoonListByUserId(int userId);
}
