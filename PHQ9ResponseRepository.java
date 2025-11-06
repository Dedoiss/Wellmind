package com.wellmind.repository;

import com.wellmind.model.PHQ9Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PHQ9ResponseRepository extends JpaRepository<PHQ9Response, Long> {
    
    @Query("SELECT p FROM PHQ9Response p WHERE p.user.id = :userId ORDER BY p.completedAt DESC")
    List<PHQ9Response> findByUserIdOrderByCompletedAtDesc(Long userId);
    
    @Query(value = "SELECT * FROM phq9_responses WHERE user_id = :userId ORDER BY completed_at DESC LIMIT 1", 
           nativeQuery = true)
    PHQ9Response findLatestByUserId(Long userId);
}
