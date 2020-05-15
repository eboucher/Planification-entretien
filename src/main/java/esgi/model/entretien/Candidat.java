package esgi.model.entretien;

import esgi.common.dto.creneau.CreneauDto;

import java.util.List;

class Candidat {
    private Integer id;
    private List<String> competences;
    private String cv;
    private List<CreneauDto> disponibilites;

    public Candidat(Integer id, List<String> competences, String cv, List<CreneauDto> disponibilites) {
        this.id = id;
        this.competences = competences;
        this.cv = cv;
        this.disponibilites = disponibilites;
    }

    public Integer getId() {
        return id;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public String getCv() {
        return cv;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }
}
