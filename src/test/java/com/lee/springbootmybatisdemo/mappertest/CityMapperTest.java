package com.lee.springbootmybatisdemo.mappertest;

import com.lee.springbootmybatisdemo.pojo.City;
import com.lee.springbootmybatisdemo.pojo.CityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityMapperTest {

    @Autowired
    private CityMapper cityMapper;

    @Test
    @Sql("/sql/test-data-city.sql")
    public void findAll() {
        City ct =  cityMapper.findByState("CA");
        System.out.println(ct);
        assertNotNull(ct);
    }
}
