package com.lzhenxing.myproject.dao;

import com.lzhenxing.myproject.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: UserDao <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
public interface UserDao {

    User getUserById(@Param("id") Long id);
}
