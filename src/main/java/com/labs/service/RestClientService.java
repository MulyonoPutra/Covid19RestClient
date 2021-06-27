package com.labs.service;

import com.labs.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientService {

    @Autowired
    private RestTemplate restTemplate;

    // GET User with return String User
    public ResponseEntity<String> getUser(int id){
        ResponseEntity<String> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users/" + id, String.class);
        return response;
    }

    // GET User with return Object User
    public ResponseEntity<User> getUserById(int id){
        User user = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" + id, User.class);
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<User[]> getAllUser(){
        ResponseEntity<User[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", User[].class);
        return response;
    }

    public ResponseEntity<User> createUser(User user){
        User response = restTemplate.postForObject("https://jsonplaceholder.typicode.com/users", user, User.class);
        return ResponseEntity.ok(response);
    }
}
