package esgi.model.entretien;

import esgi.common.dto.creneau.CreneauDto;

import java.util.List;
import java.util.UUID;

class Consultant {
    private UUID id;
    private String nom;
    private List<String> competences;
    private List<CreneauDto> disponibilites;

    public Consultant(UUID id, String nom, List<String> competences, List<CreneauDto> disponibilites) {
        this.id = id;
        this.nom = nom;
        this.competences = competences;
        this.disponibilites = disponibilites;
    }

    public UUID getId() {
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
