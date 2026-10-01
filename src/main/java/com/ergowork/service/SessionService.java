package com.ergowork.service;

import com.ergowork.model.WorkSession;
import com.ergowork.repository.WorkSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    @Autowired
    private WorkSessionRepository workSessionRepository;

    public WorkSession saveWorkSession(WorkSession workSession) {
        return workSessionRepository.save(workSession);
    }
}