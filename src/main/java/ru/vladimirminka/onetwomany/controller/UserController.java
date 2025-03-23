package ru.vladimirminka.onetwomany.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vladimirminka.onetwomany.entity.User;
import ru.vladimirminka.onetwomany.repo.UserRepository;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User saveUser = userRepository.save(user);
        return ResponseEntity.ok(saveUser);
    }
}
