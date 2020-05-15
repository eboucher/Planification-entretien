package esgi.common.dto.entretien;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.salle.SalleDto;

public class EntretienDto {
    private String id;
    private String entretienStatus;
    private CandidatDto candidat;
    private CreneauDto creneau;
    private ConsultantDto consultantDto;
    private SalleDto salle;

    public EntretienDto(String id, String entretienStatus, CandidatDto candidat, CreneauDto creneau, ConsultantDto consultantDto, SalleDto salle) {
        this.id = id;
        this.entretienStatus = entretienStatus;
        this.candidat = candidat;
        this.creneau = creneau;
        this.consultantDto = consultantDto;
        this.salle = salle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntretienStatus() {
        return entretienStatus;
    }

    public void setEntretienStatus(String entretienStatus) {
        this.entretienStatus = entretienStatus;
    }

    public CandidatDto getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatDto candidat) {
        this.candidat = candidat;
    }

    public CreneauDto getCreneau() {
        return creneau;
    }

    public void setCreneau(CreneauDto creneau) {
        this.creneau = creneau;
    }

    public ConsultantDto getConsultantDto() {
        return consultantDto;
    }

    public void setConsultantDto(ConsultantDto consultantDto) {
        this.consultantDto = consultantDto;
    }

    public SalleDto getSalle() {
        return salle;
    }

    public void setSalle(SalleDto salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "EntretienDto{" +
            "id='" + id + '\'' +
            ", entretienStatus='" + entretienStatus + '\'' +
            ", candidat=" + candidat +
            ", creneau=" + creneau +
            ", consultantDto=" + consultantDto +
            ", salle=" + salle +
            '}';
    }
}
