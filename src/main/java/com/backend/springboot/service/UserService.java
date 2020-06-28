package com.backend.springboot.service;


import com.backend.springboot.models.User;
import com.backend.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    /*public User enregistrer(User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        newUser.setRoles(user.getRoles());
        newUser.setEmail(user.getEmail());
        newUser.setNom(user.getNom());
        newUser.setPrenom(user.getPrenom());
        newUser.setCin(user.getCin());
        newUser.setDateIscription(user.getDateIscription());
        newUser.setDateNaissance(user.getDateNaissance());
        return user.save("newUser");
    }*/


    public Optional<User> findById(Long userId) {

        return userRepository.findById(userId);

    }

    public User save(@Valid User user) {

        return userRepository.save(user);
    }

    public List<User> findAll() {

        return userRepository.findAll();
    }

    public void delete(User user) {

        userRepository.delete(user);
    }
}
