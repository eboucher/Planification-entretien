package model.entretien;

import java.util.List;

public class ReservationSalle {
    private List<Salle> sallesDisponibles;
    private Salle salle;

    public ReservationSalle(List<Salle> sallesDisponibles, Salle salle) {
        this.sallesDisponibles = sallesDisponibles;
        this.salle = salle;
    }

    public ReservationSalle(List<Salle> sallesDisponibles) {
        this.sallesDisponibles = sallesDisponibles;
    }

    public void reserver(Creneau creneau) throws Exception {
        if(0 == sallesDisponibles.size()) {
            throw new Exception("");
        }

        salle = sallesDisponibles.get(0);
    }

    public List<Salle> getSallesDisponibles() {
        return sallesDisponibles;
    }

    public Salle getSalle() {
        return salle;
    }
}
