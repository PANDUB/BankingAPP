package com.main.app.controller;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.main.app.db.entity.User;
import com.main.app.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserCrudController {
    private UserCrudService userCrudService;
    @Autowired
    public UserCrudController(UserCrudService userCrudService) {
        this.userCrudService = userCrudService;
    }
    @RequestMapping(value = "/users", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity  createUser(@RequestBody User user)
    {
        try {
            User response = userCrudService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
        catch (AmazonServiceException e) {
            throw new ResponseStatusException(HttpStatus.valueOf(e.getStatusCode()), e.getMessage(), e);
        } catch (AmazonClientException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }
    }



}
