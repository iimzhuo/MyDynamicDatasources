package com.Re;

import com.Re.entity.Product;
import com.Re.mapper.MasterMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyDemo {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MasterMapper masterMapper;

    @Test
    public void Test01() throws SQLException {
        System.out.println(dataSource);
        logger.info(dataSource.getConnection().toString());
    }

    @Test
    public void Test02(){
        List<Product> list=masterMapper.selectProductList();
        for(Product item:list){
            System.out.println(item);
        }
    }
}
