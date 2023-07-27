package com.example.dockerpractice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class DockerPracticeContainer {

    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello Docker-Spring World!");
    }

}
