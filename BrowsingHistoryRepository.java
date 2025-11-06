package com.wellmind.repository;

import com.wellmind.model.BrowsingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BrowsingHistoryRepository extends JpaRepository<BrowsingHistory, Long> {
    
    List<BrowsingHistory> findByUserIdOrderByTimestampDesc(Long userId);
    
    @Query("SELECT b FROM BrowsingHistory b WHERE b.user.id = :userId AND b.timestamp >= :startDate ORDER BY b.timestamp DESC")
    List<BrowsingHistory> findByUserIdAndDateRange(Long userId, LocalDateTime startDate);
}
