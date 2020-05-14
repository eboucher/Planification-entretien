package model.entretien;

import java.util.List;

class Salle {

    private List<Creneau> disponibilites;

    public Salle(List<Creneau> disponibilites) {
        this.disponibilites = disponibilites;
    }

    public List<Creneau> getDisponibilites() {
        return this.disponibilites;
    }
}
