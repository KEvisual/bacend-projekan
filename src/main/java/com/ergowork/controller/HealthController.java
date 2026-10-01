package com.ergowork.controller;

import com.ergowork.model.HealthQuestionnaire;
import com.ergowork.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @Autowired
    private HealthService healthService;

    @PostMapping
    public ResponseEntity<HealthQuestionnaire> addHealthData(@RequestBody HealthQuestionnaire health) {
        HealthQuestionnaire savedData = healthService.saveData(health);
        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }
}