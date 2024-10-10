package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Photo;
import com.example.demo.model.User;

@Service
public class ApiService {
	
	private final RestTemplate restTemplate;
    private final ExecutorService executorService;
    
    public ApiService() {
        this.restTemplate = new RestTemplate();
        this.executorService = Executors.newCachedThreadPool();
    }
    public CompletableFuture<String> getPostsAsync() {
        return CompletableFuture.supplyAsync(() -> {
            String url = "https://jsonplaceholder.typicode.com/posts";
            return restTemplate.getForObject(url, String.class);
        }, executorService);
    }
    
    public CompletableFuture<List<Photo>> getPhotosAsync() {
        return CompletableFuture.supplyAsync(() -> {
            String url = "https://jsonplaceholder.typicode.com/photos";
            Photo[] photosArray = restTemplate.getForObject(url, Photo[].class);
            return Arrays.asList(photosArray);
        }, executorService);
    }
    
    public CompletableFuture<List<User>> getUsersAsync() {
        return CompletableFuture.supplyAsync(() -> {
            String url = "https://jsonplaceholder.org/users";
            User[] usersArray = restTemplate.getForObject(url, User[].class);
            return Arrays.asList(usersArray);
        }, executorService);
    }
    
    // Using runAsync() to fetch user by ID
    public CompletableFuture<User> getUserByIdAsync(Long id) {
        CompletableFuture<User> future = new CompletableFuture<>();
        CompletableFuture.runAsync(() -> {
            String url = "https://jsonplaceholder.org/users/"+ id;
            User user = restTemplate.getForObject(url, User.class);
            future.complete(user);
        }, executorService);
        return future;
    }
    
    // Using supplyAsync() with query parameters to fetch user by ID
    public CompletableFuture<List<User>> getUserByQueryParamAsync(Long id) {
        return CompletableFuture.supplyAsync(() -> {
            String url = "https://jsonplaceholder.org/users?id="+id;
            User[] usersArray = restTemplate.getForObject(url, User[].class);
            return Arrays.asList(usersArray);
        }, executorService);
    }
	
}
