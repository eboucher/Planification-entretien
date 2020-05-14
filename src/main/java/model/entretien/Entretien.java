package model.entretien;

import java.util.List;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;

public class Entretien {

    private Candidat candidat;
    private List<Consultant> consultant;
    private Creneau creneau;
    // private Salle salle; // Faut faire son propre aggregate

    public Entretien(CandidatDto candidat, List<ConsultantDto> consultant, CreneauDto creneau) {
        // Mapping
        this.candidat = candidat;
        this.consultant = consultant;
        this.creneau = creneau;
    }

    public Candidat getCandidat() {
        return this.candidat;
    }

    public List<Consultant> getConsultant() {
        return this.consultant;
    }

    public Creneau getCreneau() {
        return this.creneau;
    }

    public void planifier() {

    }

}