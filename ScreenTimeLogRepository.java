package com.wellmind.repository;

import com.wellmind.model.ScreenTimeLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ScreenTimeLogRepository extends JpaRepository<ScreenTimeLog, Long> {
    
    @Query(value = "SELECT * FROM screen_time_logs WHERE user_id = :userId ORDER BY date DESC LIMIT 7", 
           nativeQuery = true)
    List<ScreenTimeLog> findLast7DaysByUserId(Long userId);
    
    Optional<ScreenTimeLog> findByUserIdAndDate(Long userId, LocalDate date);
}
