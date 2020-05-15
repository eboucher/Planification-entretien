package common.dto.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;

import java.util.List;

public class EntretienDto {
    private Integer id;
    private CandidatDto candidat;
    private List<ConsultantDto> consultantsDisponibles;
    private CreneauDto creneau;

    public EntretienDto(Integer id, CandidatDto candidat, List<ConsultantDto> consultant, CreneauDto creneau) {
        this.id = id;
        this.candidat = candidat;
        this.consultantsDisponibles = consultant;
        this.creneau = creneau;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
