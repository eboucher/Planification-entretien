package model.candidat;

import java.util.List;

import model.creneau.Creneau;

public class Candidat {
    public String nom;
    public List<String> competences;
    public String cv;
    public List<Creneau> disponibilites;

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

    public String getCv() {
        return this.cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public List<Creneau> getDisponibilites() {
        return this.disponibilites;
    }

    public void setDisponibilites(List<Creneau> disponibilites) {
        this.disponibilites = disponibilites;
    }

}