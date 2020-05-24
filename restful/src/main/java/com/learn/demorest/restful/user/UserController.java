package com.learn.demorest.restful.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAOService userDAOService;

    @PostMapping(path = "/users")
    public ResponseEntity createUser(@RequestBody User user) {
        User savedUser = userDAOService.save(user);
        System.out.println(savedUser.toString());
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(path = "/users")
    public List<User> retriveAllUsers() {
        return userDAOService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User retriveUserById(@PathVariable int id) {
        return userDAOService.findOne(id);
    }

}
