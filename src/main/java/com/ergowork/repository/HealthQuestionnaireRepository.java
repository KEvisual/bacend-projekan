package com.ergowork.repository;

import com.ergowork.model.HealthQuestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthQuestionnaireRepository extends JpaRepository<HealthQuestionnaire, Long> {
}