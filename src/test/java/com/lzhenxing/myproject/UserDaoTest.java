package com.lzhenxing.myproject;

import com.lzhenxing.myproject.dao.UserDao;
import com.lzhenxing.myproject.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: UserDaoTest <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getUserByIdTest(){

        System.out.println("userDao: " + userDao);
        User user = userDao.getUserById(1L);
        System.out.println(user.toString());

    }
}
