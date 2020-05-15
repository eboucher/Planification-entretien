package model.entretien;

import java.util.List;

class Candidat {
    private Integer id;
    private List<String> competences;
    private String cv;
    private List<Creneau> disponibilites;

    public Candidat(Integer id, List<String> competences, String cv, List<Creneau> disponibilites) {
        this.id = id;
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

    public Integer getId() {
        return id;
    }
}
