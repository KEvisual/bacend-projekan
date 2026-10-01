package com.ergowork.service;

import com.ergowork.dto.request.LoginRequest;
import com.ergowork.dto.request.RegisterRequest;
import com.ergowork.model.User;
import com.ergowork.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String authenticate(LoginRequest loginRequest) {
        User user = userRepository.findAll().stream()
                .filter(u -> u.getEmail().equals(loginRequest.getEmail()))
                .findFirst()
                .orElse(null);

        // Mencocokkan password dengan kolom password_hash di database
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return "Login Berhasil! Selamat datang, " + user.getName();
        }
        return "Gagal Login: Email atau Password salah.";
    }

    public String register(RegisterRequest request) {
        // Cek apakah email sudah terdaftar
        boolean exists = userRepository.findAll().stream()
                .anyMatch(u -> u.getEmail().equals(request.getEmail()));

        if (exists) {
            return "Registrasi Gagal: Email sudah digunakan.";
        }

        User newUser = new User();
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(request.getPassword()); // Disimpan ke kolom password_hash
        newUser.setProfession(request.getProfession());
        newUser.setCreatedAt(LocalDateTime.now());

        userRepository.save(newUser);
        return "Registrasi Berhasil! Silakan login.";
    }
}