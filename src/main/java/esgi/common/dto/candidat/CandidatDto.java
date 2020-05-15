package esgi.common.dto.candidat;

import esgi.common.dto.creneau.CreneauDto;

import java.util.List;

public class CandidatDto {
    private String id;
    private List<String> competences;
    private String cv;
    private List<CreneauDto> disponibilites;

    public CandidatDto(String id, List<String> competences, String cv, List<CreneauDto> disponibilites) {
        this.id = id;
        this.competences = competences;
        this.cv = cv;
        this.disponibilites = disponibilites;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }
}
