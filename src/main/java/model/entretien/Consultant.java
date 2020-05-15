package model.entretien;

import common.dto.creneau.CreneauDto;

import java.util.List;

class Consultant {
    private Integer id;
    private String nom;
    private List<String> competences;
    private List<CreneauDto> disponibilites;

    public Consultant(Integer id, String nom, List<String> competences, List<CreneauDto> disponibilites) {
        this.id = id;
        this.nom = nom;
        this.competences = competences;
        this.disponibilites = disponibilites;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }
}
