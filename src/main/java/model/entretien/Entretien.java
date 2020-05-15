package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import model.common.EntretienStatus;

import java.util.List;
import java.util.stream.Collectors;

public class Entretien {
    private int id;
    private EntretienStatus entretienStatus;
    private Candidat candidat;
    private List<Consultant> consultantsDisponibles;
    private Consultant consultant;
    private Creneau creneau;
    private ReservationSalle reservationSalle;

    public Entretien(CandidatDto candidatDto, List<ConsultantDto> consultantDtos, CreneauDto creneauDto) {
        this.candidat = CandidatMap.toModel(candidatDto);
        this.consultantsDisponibles = consultantDtos.stream().map(ConsultantMap::toModel).collect(Collectors.toList());
        this.creneau = CreneauMap.toModel(creneauDto);
    }

    public Entretien(Candidat candidat, List<Consultant> consultant, Creneau creneau) {
        this.candidat = candidat;
        this.consultantsDisponibles = consultant;
        this.creneau = creneau;
    }

    public void planifier() throws Exception {
        if(0 == consultantsDisponibles.size()) {
            throw new Exception("");
        }

        consultant = consultantsDisponibles.get(0);
        entretienStatus = EntretienStatus.PLANIFIER;
    }

    public int getId() {
        return id;
    }

    public EntretienStatus getEntretienStatus() {
        return entretienStatus;
    }

    public Candidat getCandidat() {
        return this.candidat;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public List<Consultant> getConsultantsDisponibles() {
        return this.consultantsDisponibles;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public ReservationSalle getReservationSalle() {
        return reservationSalle;
    }
}
