package com.ergowork.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "health_questionnaires")
@Data
public class HealthQuestionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "recorded_date")
    private LocalDateTime recordedDate;

    @Column(name = "pain_level_score")
    private Integer painLevelScore;

    @Column(name = "pain_location")
    private String painLocation;
}