package com.lee.springbootmybatisdemo.pojo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM city WHERE state = #{state}")
    City findByState(@Param("state") String state);

}
