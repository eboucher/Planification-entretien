package model.entretien;

import java.util.List;

import model.candidat.Candidat;
import model.consultant.Consultant;
import model.creneau.Creneau;
import model.salle.Salle;

public class Entretien {
    private Candidat candidat;
    private List<Consultant> consultant;
    private Creneau creneau;
    private List<Salle> salle;

    public Entretien(
        Candidat candidat,
        List<Consultant> consultant,
        List<Salle> salle
    ) {
        this.candidat = candidat;
        this.consultant = consultant;
        this.creneau = creneau;
        this.salle = salle;
    }

    public void choisirCreneau() {
        
    }

    public void choisirConsultant() {

    }

    public void choisirSalle() {

    }
}