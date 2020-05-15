package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.creneau.CreneauDto;

import java.util.List;

class Candidat {
    private List<String> competences;
    private String cv;
    private List<Creneau> disponibilites;

    public Candidat(List<String> competences, String cv, List<Creneau> disponibilites) {
        this.competences = competences;
        this.cv = cv;
        this.disponibilites = disponibilites;
    }

    public List<String> getCompetences() {
        return this.competences;
    }

    public String getCv() {
        return this.cv;
    }

    public List<Creneau> getDisponibilites() {
        return this.disponibilites;
    }
}
