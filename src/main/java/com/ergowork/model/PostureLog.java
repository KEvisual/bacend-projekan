package com.ergowork.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posture_logs")
public class PostureLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "session_id")
    private Long sessionId;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "posture_type")
    private String postureType;

    @Column(name = "severity_duration_seconds")
    private Long severityDurationSeconds;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getSessionId() { return sessionId; }
    public void setSessionId(Long sessionId) { this.sessionId = sessionId; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public String getPostureType() { return postureType; }
    public void setPostureType(String postureType) { this.postureType = postureType; }
    public Long getSeverityDurationSeconds() { return severityDurationSeconds; }
    public void setSeverityDurationSeconds(Long severityDurationSeconds) { this.severityDurationSeconds = severityDurationSeconds; }
}