package com.ergowork.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Matikan CSRF karena kita menggunakan REST API stateless
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) // Tanpa session HTTP (menggunakan JWT)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/auth/**").permitAll() // Endpoint auth (login/register) bisa diakses publik
                        .requestMatchers("/api/work-sessions/**", "/api/stretch-records/**").permitAll() // Sementara di-permitAll untuk memudahkan testing CRUD Anda
                        .anyRequest().authenticated() // Sisa request lainnya wajib ada autentikasi
                );

        return http.build();
    }
}