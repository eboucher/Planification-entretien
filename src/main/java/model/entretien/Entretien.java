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
    private List<Consultant> consultant;
    private Creneau creneau;
    private ReservationSalle reservationSalle;

    public Entretien(CandidatDto candidatDto, List<ConsultantDto> consultantDtos, CreneauDto creneauDto) {
        this.candidat = CandidatMap.toModel(candidatDto);
        this.consultant = consultantDtos.stream().map(ConsultantMap::toModel).collect(Collectors.toList());
        this.creneau = CreneauMap.toModel(creneauDto);
    }

    public Entretien(Candidat candidat, List<Consultant> consultant, Creneau creneau) {
        this.candidat = candidat;
        this.consultant = consultant;
        this.creneau = creneau;
    }

    public void planifier() {

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

    public List<Consultant> getConsultant() {
        return this.consultant;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public ReservationSalle getReservationSalle() {
        return reservationSalle;
    }
}
