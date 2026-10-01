package com.ergowork.controller;

import com.ergowork.model.PostureLog;
import com.ergowork.service.PostureLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posture-logs")
public class PostureLogController {

    @Autowired
    private PostureLogService postureLogService;

    @PostMapping
    public ResponseEntity<PostureLog> createPostureLog(@RequestBody PostureLog postureLog) {
        PostureLog savedLog = postureLogService.savePostureLog(postureLog);
        return new ResponseEntity<>(savedLog, HttpStatus.CREATED);
    }
}