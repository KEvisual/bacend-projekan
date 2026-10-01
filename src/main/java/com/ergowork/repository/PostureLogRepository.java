package com.ergowork.repository;

import com.ergowork.model.PostureLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostureLogRepository extends JpaRepository<PostureLog, Long> {
}