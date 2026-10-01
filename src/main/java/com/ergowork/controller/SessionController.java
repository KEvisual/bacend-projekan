package com.ergowork.controller;

import com.ergowork.model.WorkSession;
import com.ergowork.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/work-sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping
    public ResponseEntity<WorkSession> createWorkSession(@RequestBody WorkSession workSession) {
        WorkSession savedSession = sessionService.saveWorkSession(workSession);
        return new ResponseEntity<>(savedSession, HttpStatus.CREATED);
    }
}