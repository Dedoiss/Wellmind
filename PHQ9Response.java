package com.wellmind.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "phq9_responses")
public class PHQ9Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @Column(nullable = false)
    private Integer q1; // 1-5
    
    @Column(nullable = false)
    private Integer q2; // 1-5
    
    @Column(nullable = false)
    private Integer q3; // 1-5
    
    @Column(nullable = false)
    private Integer q4; // 1-5
    
    @Column(nullable = false)
    private Integer q5; // 1-5
    
    @Column(name = "total_score")
    private Integer totalScore;
    
    @Column(name = "completed_at")
    private LocalDateTime completedAt;
    
    @PrePersist
    protected void onCreate() {
        completedAt = LocalDateTime.now();
        calculateTotalScore();
    }
    
    public void calculateTotalScore() {
        this.totalScore = (q1 != null ? q1 : 0) + 
                         (q2 != null ? q2 : 0) + 
                         (q3 != null ? q3 : 0) + 
                         (q4 != null ? q4 : 0) + 
                         (q5 != null ? q5 : 0);
    }
}
