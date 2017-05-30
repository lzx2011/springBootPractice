package com.lzhenxing.myproject;

import com.lzhenxing.myproject.web.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ExtendedModelMap;

/**
 * ClassName: UserControllerTest <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void userTest() throws Exception{
        String user = this.userController.getUser(new ExtendedModelMap(), 1L);
        System.out.println(user);
    }

}
