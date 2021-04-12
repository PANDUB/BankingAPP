package com.main.app.service;

import com.main.app.db.entity.User;

import java.util.concurrent.CompletableFuture;

public interface UserCrudService {

    public User createUser(User user);

    public static void main(String[] args) {


        CompletableFuture<String> co = new CompletableFuture<>();
        co.thenApply(r -> "heelo");

       // CompletableFuture<String> cosync = CompletableFuture.runAsync();

    }
}
