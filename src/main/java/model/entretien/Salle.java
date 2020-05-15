package model.entretien;

import common.dto.creneau.CreneauDto;

import java.util.List;

class Salle {

    private Integer id;
    private List<CreneauDto> disponibilites;

    public Salle(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }

    public Integer getId() {
        return id;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }
}
