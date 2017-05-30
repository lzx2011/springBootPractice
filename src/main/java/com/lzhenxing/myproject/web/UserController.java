package com.lzhenxing.myproject.web;

import com.lzhenxing.myproject.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName: UserController <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getUser(Model model, @PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("liu");
        user.setAge(20);
        model.addAttribute("user", user);
        return "user";
    }

}
