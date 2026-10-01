package com.ergowork.service;

import com.ergowork.model.HealthQuestionnaire;
import com.ergowork.repository.HealthQuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    @Autowired
    private HealthQuestionnaireRepository healthQuestionnaireRepository;

    public HealthQuestionnaire saveData(HealthQuestionnaire health) {
        return healthQuestionnaireRepository.save(health);
    }
}