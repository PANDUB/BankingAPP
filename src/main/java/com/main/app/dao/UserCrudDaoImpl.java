package com.main.app.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.main.app.db.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCrudDaoImpl implements  UserCrudDao{
    private DynamoDBMapper dynamoDBMapper;

    @Autowired
    public UserCrudDaoImpl(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    @Override
    public User createUser(User user) {
        dynamoDBMapper.save(user);
        return user;
    }
}
