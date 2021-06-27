package com.labs.controller;


import com.labs.dto.User;
import com.labs.service.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class RestClientController {

    @Autowired
    private RestClientService restClientService;


    // GET http://localhost:8080/api/users/1
    @GetMapping("/{id}")
    public ResponseEntity<String> findUserById(@PathVariable("id") int id) {
        return restClientService.getUser(id);
    }

    // GET http://localhost:8080/api/users/object/1
    @GetMapping("/object/{id}")
    public ResponseEntity<User> findUserObjectById(@PathVariable("id") int id) {
        return restClientService.getUserById(id);
    }

    @GetMapping
    public ResponseEntity<?> findAllUser() {
        return restClientService.getAllUser();
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return restClientService.createUser(user);
    }

}
