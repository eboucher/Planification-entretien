package model.consultant;

import java.util.List;

public class Consultant {
    private String nom;
    private List<String> competences;

    public Consultant(String nom, List<String> competences) {
        this.nom = nom;
        this.competences = competences;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getCompetences() {
        return this.competences;
    }

    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }

}