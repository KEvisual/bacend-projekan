package com.ergowork.repository;

import com.ergowork.model.StretchRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StretchRecordRepository extends JpaRepository<StretchRecord, Long> {
}