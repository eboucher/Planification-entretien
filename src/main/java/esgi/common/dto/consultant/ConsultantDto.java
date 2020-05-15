package esgi.common.dto.consultant;

import esgi.common.dto.creneau.CreneauDto;

import java.util.List;

public class ConsultantDto {
    private String id;
    private String nom;
    private List<String> competences;
    private List<CreneauDto> disponibilites;

    public ConsultantDto(String id, String nom, List<String> competences, List<CreneauDto> disponibilites) {
        this.id = id;
        this.nom = nom;
        this.competences = competences;
        this.disponibilites = disponibilites;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }

    @Override
    public String toString() {
        return "ConsultantDto{" +
            "id='" + id + '\'' +
            ", nom='" + nom + '\'' +
            ", competences=" + competences +
            ", disponibilites=" + disponibilites +
            '}';
    }
}
