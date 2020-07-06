package com.main.app.service;

import com.main.app.dao.UserCrudDao;
import com.main.app.db.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCrudServiceImpl  implements  UserCrudService{
    private UserCrudDao userCrudDao;
@Autowired
    public UserCrudServiceImpl (UserCrudDao userCrudDao) {
        this.userCrudDao = userCrudDao;

    }
    @Override
    public User createUser(User user) {
        return userCrudDao.createUser(user);
    }
}
