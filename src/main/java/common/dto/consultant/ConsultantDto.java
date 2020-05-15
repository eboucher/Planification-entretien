package common.dto.consultant;

import common.dto.creneau.CreneauDto;

import java.util.List;

public class ConsultantDto {
    private Integer id;
    private String nom;
    private List<String> competences;
    private List<CreneauDto> disponibilites;

    public ConsultantDto(Integer id, String nom, List<String> competences, List<CreneauDto> disponibilites) {
        this.id = id;
        this.nom = nom;
        this.competences = competences;
        this.disponibilites = disponibilites;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
