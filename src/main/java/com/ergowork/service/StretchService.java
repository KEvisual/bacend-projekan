package com.ergowork.service;

import com.ergowork.model.StretchRecord;
import com.ergowork.repository.StretchRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StretchService {

    @Autowired
    private StretchRecordRepository stretchRecordRepository;

    public StretchRecord saveStretchRecord(StretchRecord stretchRecord) {
        return stretchRecordRepository.save(stretchRecord);
    }
}