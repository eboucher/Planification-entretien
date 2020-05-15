package model.entretien;

import java.util.List;

public class ReservationSalle {
    private Salle salle;

    public ReservationSalle(Salle salle) {
        this.salle = salle;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
}
