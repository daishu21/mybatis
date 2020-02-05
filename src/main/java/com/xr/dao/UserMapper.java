package com.xr.dao;

import com.xr.model.User;

import java.util.List;

public interface UserMapper {

    //获得表中所有数据
    List<User> getUsers();

}
