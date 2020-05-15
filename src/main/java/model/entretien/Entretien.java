package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import model.common.EntretienStatus;

import java.util.List;
import java.util.stream.Collectors;

public class Entretien {

    //private int id;
    private EntretienStatus entretienStatus;
    private Candidat candidat;
    private List<Consultant> consultant;
    // private Creneau creneau;

    public Entretien(CandidatDto candidatDto, List<ConsultantDto> consultantDtos) {
        this.candidat = CandidatMap.toModel(candidatDto);
        this.consultant = consultantDtos.stream().map(ConsultantMap::toModel).collect(Collectors.toList());
    }

    public Entretien(Candidat candidat, List<Consultant> consultant) {
        this.candidat = candidat;
        this.consultant = consultant;
    }

    public Candidat getCandidat() {
        return this.candidat;
    }

    public List<Consultant> getConsultant() {
        return this.consultant;
    }

    public void planifier() {

    }

}
