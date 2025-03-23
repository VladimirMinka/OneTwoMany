package ru.vladimirminka.onetwomany.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vladimirminka.onetwomany.entity.Auto;
import ru.vladimirminka.onetwomany.repo.AutoRepository;

@RestController
@RequestMapping("/autos")
@AllArgsConstructor
public class AutoController {
    private AutoRepository autoRepository;


    @PostMapping
    public ResponseEntity<Auto> addAuto(@RequestBody Auto auto) {
        Auto saveAuto = autoRepository.save(auto);
        return ResponseEntity.ok(saveAuto);
    }
}
