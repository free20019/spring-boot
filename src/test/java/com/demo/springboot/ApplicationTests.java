package com.demo.springboot;

import com.demo.springboot.javabean.person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHello(){
        boolean b=ioc.containsBean("helloService");
        System.out.println("222222222222222222="+b);
    }
    @Test
    public void contextLoads() {
        System.out.println("11111111111111111111111111="+person);
    }

}
