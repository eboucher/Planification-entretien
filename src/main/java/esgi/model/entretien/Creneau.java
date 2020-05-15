package esgi.model.entretien;

import java.time.LocalDateTime;

class Creneau {
    // TODO: ajouter du metier
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Creneau(LocalDateTime startDate, LocalDateTime endDate) {
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
