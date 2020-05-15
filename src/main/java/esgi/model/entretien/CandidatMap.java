package esgi.model.entretien;

import esgi.common.dto.candidat.CandidatDto;

public class CandidatMap {

    public static CandidatDto toDto(Candidat candidat) {
        return new CandidatDto(candidat.getId(), candidat.getCompetences(), candidat.getCv(), candidat.getDisponibilites());
    }

    public static Candidat toModel(CandidatDto candidatDto) {
        return new Candidat(candidatDto.getId(), candidatDto.getCompetences(), candidatDto.getCv(), candidatDto.getDisponibilites());
    }
}
