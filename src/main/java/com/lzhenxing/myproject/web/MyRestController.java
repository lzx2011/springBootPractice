package com.lzhenxing.myproject.web;

import com.lzhenxing.myproject.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: MyRestController <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
@RestController
@RequestMapping(value="/users")
public class MyRestController {

    @RequestMapping(value="/{user}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        // ...
        User user1 = new User();
        user1.setId(user);
        user1.setName("liu");
        user1.setAge(20);
        return user1;
    }

    //@RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
    //List<Customer> getUserCustomers(@PathVariable Long user) {
    //    // ...
    //}

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        // ...
        User user1 = new User();
        user1.setId(user);
        user1.setName("liu");
        return user1;
    }

}