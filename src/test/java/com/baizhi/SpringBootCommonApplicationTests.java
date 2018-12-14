package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCommonApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        User user=userMapper.selectByPrimaryKey(3);
        System.out.println(user);
    }

}

