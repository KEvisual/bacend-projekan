package com.ergowork.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "stretch_records")
public class StretchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    @Column(name = "stretch_category")
    private String stretchCategory;

    @Column(name = "duration_seconds")
    private Long durationSeconds;

    // Getter dan Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public LocalDateTime getCompletedAt() { return completedAt; }
    public void setCompletedAt(LocalDateTime completedAt) { this.completedAt = completedAt; }

    public String getStretchCategory() { return stretchCategory; }
    public void setStretchCategory(String stretchCategory) { this.stretchCategory = stretchCategory; }

    public Long getDurationSeconds() { return durationSeconds; }
    public void setDurationSeconds(Long durationSeconds) { this.durationSeconds = durationSeconds; }
}