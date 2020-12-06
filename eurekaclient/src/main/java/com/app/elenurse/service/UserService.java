package com.app.elenurse.service;

import com.app.elenurse.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAllUser();

    /**
     * 通过信息查询用户
     * @return
     */
    List<User> queryUsersByCondition(User user);

    /**
     *
     * @return
     */
    User queryUserByUserCode(String userCode);
}
