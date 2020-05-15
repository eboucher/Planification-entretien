package model.entretien;

import common.dto.creneau.CreneauDto;

import java.util.List;

class Salle {

    private List<Creneau> disponibilites;

    public Salle(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }

    public List<Creneau> getDisponibilites() {
        return this.disponibilites;
    }
}
