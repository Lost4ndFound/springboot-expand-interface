package org.study.test;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: lsw
 * @date: 2023/3/28 13:49
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestClass {

    @Autowired
    private ConfigurableApplicationContext applicationContext;


    @Test
    public void test(){

    }

}
