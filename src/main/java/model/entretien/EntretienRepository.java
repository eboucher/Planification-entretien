package model.entretien;

import java.util.List;

import model.candidat.Candidat;
import model.consultant.Consultant;
import model.creneau.Creneau;
import model.salle.Salle;

public interface EntretienRepository {
    Candidat getCandidat();
    List<Consultant> getConsultants();
    Creneau getCreneau();
    List<Salle> getSalles();
}