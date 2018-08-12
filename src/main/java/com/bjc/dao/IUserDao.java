package com.bjc.dao;

import com.bjc.model.User;

public interface IUserDao {
    public User selectUser(long userId);

}
