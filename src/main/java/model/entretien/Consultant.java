package model.entretien;

import java.util.List;

class Consultant {
    private Integer id;
    private String nom;
    private List<String> competences;

    public Consultant(Integer id, String nom, List<String> competences) {
        this.id = id;
        this.nom = nom;
        this.competences = competences;
    }

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

    public Integer getId() {
        return id;
    }
}
