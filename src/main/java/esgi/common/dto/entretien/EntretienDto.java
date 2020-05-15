package esgi.common.dto.entretien;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.model.common.EntretienStatus;

import java.util.List;

public class EntretienDto {
    private String id;
    private CandidatDto candidat;
    private List<ConsultantDto> consultantsDisponibles;
    private CreneauDto creneau;
    private EntretienStatus entretienStatus;

    public EntretienDto(String id, CandidatDto candidat, List<ConsultantDto> consultant, CreneauDto creneau, EntretienStatus entretienStatus) {
        this.id = id;
        this.candidat = candidat;
        this.consultantsDisponibles = consultant;
        this.creneau = creneau;
        this.entretienStatus = entretienStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CandidatDto getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatDto candidat) {
        this.candidat = candidat;
    }

    public List<ConsultantDto> getConsultantsDisponibles() {
        return consultantsDisponibles;
    }

    public void setConsultant(List<ConsultantDto> consultant) {
        this.consultantsDisponibles = consultant;
    }

    public CreneauDto getCreneau() {
        return creneau;
    }

    public void setCreneau(CreneauDto creneau) {
        this.creneau = creneau;
    }

    public EntretienStatus getEntretienStatus() {
        return entretienStatus;
    }

    public void setEntretienStatus(EntretienStatus entretienStatus) {
        this.entretienStatus = entretienStatus;
    }
}
