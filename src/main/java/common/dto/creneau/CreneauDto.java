package common.dto.creneau;

import java.time.LocalDateTime;
import java.util.Date;

public class CreneauDto {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public CreneauDto(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
