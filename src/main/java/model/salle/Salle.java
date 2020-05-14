package model.salle;

import java.util.List;
import model.creneau.Creneau;

public class Salle {
    private List<Creneau> disponibilites;

    public List<Creneau> getDisponibilites() {
        return this.disponibilites;
    }

    public void setDisponibilites(List<Creneau> disponibilites) {
        this.disponibilites = disponibilites;
    }

}