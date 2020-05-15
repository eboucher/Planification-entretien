package common.dto.candidat;

import common.dto.creneau.CreneauDto;

import java.util.List;

public class CandidatDto {
    private List<String> competences;
    private String cv;
    private List<CreneauDto> disponibilites;

    public CandidatDto(List<String> competences, String cv, List<CreneauDto> disponibilites) {
        this.competences = competences;
        this.cv = cv;
        this.disponibilites = disponibilites;
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
