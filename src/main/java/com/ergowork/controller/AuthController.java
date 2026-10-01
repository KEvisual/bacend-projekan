package com.ergowork.controller;

import com.ergowork.dto.request.LoginRequest;
import com.ergowork.dto.request.RegisterRequest;
import com.ergowork.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        String result = authService.authenticate(loginRequest);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        String result = authService.register(registerRequest);
        return ResponseEntity.ok(result);
    }
}