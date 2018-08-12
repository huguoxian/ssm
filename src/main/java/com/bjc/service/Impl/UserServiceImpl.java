package com.bjc.service.Impl;

import com.bjc.dao.IUserDao;
import com.bjc.model.User;
import com.bjc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author guoxian
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
