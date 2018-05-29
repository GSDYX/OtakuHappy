package com.gsdyx.otakuhappy.mapper;

import com.gsdyx.otakuhappy.pojo.Cartoon;
import com.gsdyx.otakuhappy.pojo.CartoonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("CartoonMapper")
public interface CartoonMapper {
    int countByExample(CartoonExample example);

    int deleteByExample(CartoonExample example);

    int deleteByPrimaryKey(Integer cartoonid);

    int insert(Cartoon record);

    int insertSelective(Cartoon record);

    List<Cartoon> selectByExample(CartoonExample example);

    Cartoon selectByPrimaryKey(Integer cartoonid);

    int updateByExampleSelective(@Param("record") Cartoon record, @Param("example") CartoonExample example);

    int updateByExample(@Param("record") Cartoon record, @Param("example") CartoonExample example);

    int updateByPrimaryKeySelective(Cartoon record);

    int updateByPrimaryKey(Cartoon record);
}