package model.candidat;

import java.util.List;

import model.creneau.Creneau;

public interface CandidatRepository {
    String getNom();
    List<String> getCompetences();
    String getCv();
    List<Creneau> getDisponibilites();
}