package com.ergowork.repository;

import com.ergowork.model.WorkSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkSessionRepository extends JpaRepository<WorkSession, Long> {
}