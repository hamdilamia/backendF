package com.backend.springboot.controllers;

import com.backend.springboot.exception.ResourceNotFoundException;
import com.backend.springboot.models.User;
import com.backend.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/suiviProd/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User add(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long UserId)
            throws ResourceNotFoundException {
        User User = userService.findById(UserId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + UserId));
        return ResponseEntity.ok().body(User);
    }

    /*
    @PostMapping("")
    public User createUser(@Valid @RequestBody User User) {
        return userService.save(User);
    }
    */

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long UserId,
                                           @Valid @RequestBody User userDetails) throws ResourceNotFoundException {
        User user = userService.findById(UserId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + UserId));

        user.setEmail(userDetails.getEmail());
       /* user.setLastName(userDetails.get;
        user.setFirstName(userDetails.getFirstName());*/

        final User updatedUser = userService.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long UserId)
            throws ResourceNotFoundException {
        User user = userService.findById(UserId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + UserId));

        userService.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
