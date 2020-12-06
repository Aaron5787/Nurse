package com.app.elenurse.domain.mapper;

import com.app.elenurse.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    List<User> queryAllUser();

}

