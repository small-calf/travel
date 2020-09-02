package com.wyl.travels_plus;

import com.wyl.travels_plus.entity.User;
import com.wyl.travels_plus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TravelsPlusApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("xxx");
        user.setPassword("sss");
        user.setEmail("xiaoochengqq@.com");
        userService.register(user);
    }

}
