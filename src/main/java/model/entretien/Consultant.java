package model.entretien;

import java.util.List;

class Consultant {
    private String nom;
    private List<String> competences;

    public Consultant(String nom, List<String> competences) {
        this.nom = nom;
        this.competences = competences;
    }

    public String getNom() {
        return this.nom;
    }

    public List<String> getCompetences() {
        return this.competences;
    }

}
