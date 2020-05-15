package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import common.dto.salle.SalleDto;
import model.common.EntretienStatus;

import java.util.List;
import java.util.stream.Collectors;

public class Entretien {
    private int id;
    private EntretienStatus entretienStatus;
    private Candidat candidat;
    private Creneau creneau;

    private List<Consultant> consultantsDisponibles;
    private Integer consultantId;

    private List<SalleDto> salleDtos;
    private Integer salleId;

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
        List<Consultant> consultantDispoCompetent = consultantsDisponibles
            .stream()
            .filter(consultant -> consultant.getCompetences().stream().anyMatch(consultantCompetences -> candidat.getCompetences().contains(consultantCompetences)))
            .collect(Collectors.toList());
        consultantId = consultantDispoCompetent.get(0).getId();
        entretienStatus = EntretienStatus.PLANIFIER;
    }

    public void annuler() {
        this.entretienStatus = EntretienStatus.ANNULER;
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

    public Integer getConsultantId() {
        return consultantId;
    }

    public List<Consultant> getConsultantsDisponibles() {
        return this.consultantsDisponibles;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public List<SalleDto> getSalleDtos() {
        return salleDtos;
    }

    public Integer getSalleId() {
        return salleId;
    }

    public void setSalleId(Integer salleId) {
        this.salleId = salleId;
    }
}
