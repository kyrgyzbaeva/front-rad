package com.example.frontpractica.controller;

import com.example.frontpractica.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    @PostMapping("/register")
    public com.example.frontpractica.controller.ResponseEntity<?> register(@RequestParam String email, @RequestParam String password) {
        String token = authService.register(email, password);
        return com.example.frontpractica.controller.ResponseEntity.ok().body("User registered successfully. Token: " + token);
    }те

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
        String token = authService.login(email, password);
        return ResponseEntity.ok().body("Token: " + token);
    }
}