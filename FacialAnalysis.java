package com.wellmind.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "facial_analyses")
public class FacialAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @Column(name = "image_url", length = 500)
    private String imageUrl;
    
    @Column(length = 50)
    private String emotion; // Feliz, Neutro, Triste
    
    private Double confidence;
    
    @Column(name = "faces_detected")
    private Integer facesDetected;
    
    @Column(name = "eye_contact")
    private Boolean eyeContact;
    
    @Column(columnDefinition = "TEXT")
    private String analysis;
    
    @Column(name = "captured_at")
    private LocalDateTime capturedAt;
    
    @PrePersist
    protected void onCreate() {
        capturedAt = LocalDateTime.now();
    }
}
