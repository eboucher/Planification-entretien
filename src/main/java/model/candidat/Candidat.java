package model.candidat;

import java.util.List;

import model.creneau.Creneau;

public class Candidat {
    private String nom;
    private List<String> competences;
    private String cv;
    private List<Creneau> disponibilites;

    public Candidat(String nom, List<String> competences, String cv, List<Creneau> disponibilites) {
        this.nom = nom;
        this.competences = competences;
        this.cv = cv;
        this.disponibilites = disponibilites;
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