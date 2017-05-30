package com.lzhenxing.myproject;

import com.lzhenxing.myproject.domain.User;
import com.lzhenxing.myproject.web.MyRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: MyRestControllerTest <br/>
 * Function: <br/>
 *
 * 参考文档:
 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html
 *
 * @author gary.liu
 * @date 2017/5/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyRestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private MyRestController myRestController;

    @Test
    public void userTest() {

        User user1 = restTemplate.getForObject("/users/2", User.class);
        System.out.println(user1.toString());

        User user = this.myRestController.getUser(1L);
        System.out.println(user.toString());

    }

}
