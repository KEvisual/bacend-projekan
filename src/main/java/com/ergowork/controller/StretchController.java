package com.ergowork.controller;

import com.ergowork.model.StretchRecord;
import com.ergowork.service.StretchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stretch-records")
public class StretchController {

    @Autowired
    private StretchService stretchService;

    @PostMapping
    public ResponseEntity<StretchRecord> createStretchRecord(@RequestBody StretchRecord stretchRecord) {
        StretchRecord savedRecord = stretchService.saveStretchRecord(stretchRecord);
        return new ResponseEntity<>(savedRecord, HttpStatus.CREATED);
    }
}