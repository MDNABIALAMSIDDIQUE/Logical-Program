package com.example.demo.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Photo;
import com.example.demo.model.User;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
    private	ApiService service;
	
	 @GetMapping("/demoData")
	    public CompletableFuture<String> fetchPosts() {
	        return service.getPostsAsync();
	    }
	 
	 @GetMapping("/photos")
	    public CompletableFuture<List<Photo>> fetchPhotos() {
	        return service.getPhotosAsync();
	    }
	 
	 @GetMapping("/usersAll")
	    public CompletableFuture<List<User>> fetchUsers() {
	        return service.getUsersAsync();
	    }
	 
	 @GetMapping("/userById/{id}")
	    public CompletableFuture<User> fetchUserById(@PathVariable Long id) {
	        return service.getUserByIdAsync(id);
	    }
	  
	   // Fetch user by query param using supplyAsync()
	  @GetMapping("/fetchuserquery")
	    public CompletableFuture<List<User>> fetchUserByQueryParam(@RequestParam Long id) {
	        return service.getUserByQueryParamAsync(id);
	    }
	  
	  
}
