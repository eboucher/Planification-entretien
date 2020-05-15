package common.dto.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;

import java.util.List;

public class EntretienDto {
    private CandidatDto candidat;
    private List<ConsultantDto> consultant;
    private CreneauDto creneau;

    public EntretienDto(CandidatDto candidat, List<ConsultantDto> consultant, CreneauDto creneau) {
        this.candidat = candidat;
        this.consultant = consultant;
        this.creneau = creneau;
    }

    public CandidatDto getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatDto candidat) {
        this.candidat = candidat;
    }

    public List<ConsultantDto> getConsultant() {
        return consultant;
    }

    public void setConsultant(List<ConsultantDto> consultant) {
        this.consultant = consultant;
    }

    public CreneauDto getCreneau() {
        return creneau;
    }

    public void setCreneau(CreneauDto creneau) {
        this.creneau = creneau;
    }
}
