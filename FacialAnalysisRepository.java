package com.wellmind.repository;

import com.wellmind.model.FacialAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FacialAnalysisRepository extends JpaRepository<FacialAnalysis, Long> {
    
    List<FacialAnalysis> findByUserIdOrderByCapturedAtDesc(Long userId);
    
    @Query("SELECT f FROM FacialAnalysis f WHERE f.user.id = :userId AND f.capturedAt >= :startDate ORDER BY f.capturedAt DESC")
    List<FacialAnalysis> findRecentByUserId(Long userId, LocalDateTime startDate);
}
