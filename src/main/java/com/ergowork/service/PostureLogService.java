package com.ergowork.service;

import com.ergowork.model.PostureLog;
import com.ergowork.repository.PostureLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostureLogService {

    @Autowired
    private PostureLogRepository postureLogRepository;

    public PostureLog savePostureLog(PostureLog postureLog) {
        return postureLogRepository.save(postureLog);
    }
}