package com.wellmind.dto;

import lombok.Data;
import java.util.List;

@Data
public class DashboardDTO {
    private Integer phq9Score;
    private Integer screenTimeToday;
    private Integer healthyContentPercent;
    private Integer mentalHealthScore;
    private List<ScreenTimeTrendDTO> screenTimeTrend;
    private List<PHQ9TrendDTO> phq9Trend;
}

@Data
class ScreenTimeTrendDTO {
    private String date;
    private Integer minutes;
}

@Data
class PHQ9TrendDTO {
    private String date;
    private Integer score;
}
