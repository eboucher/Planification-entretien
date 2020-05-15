package esgi.model.entretien;

import esgi.common.dto.candidat.CandidatDto;

import java.util.UUID;

public class CandidatMap {

    public static CandidatDto toDto(Candidat candidat) {
        return new CandidatDto(candidat.getId().toString(), candidat.getCompetences(), candidat.getCv(), candidat.getDisponibilites());
    }

    public static Candidat toModel(CandidatDto candidatDto) {
        return new Candidat(UUID.fromString(candidatDto.getId()), candidatDto.getCompetences(), candidatDto.getCv(), candidatDto.getDisponibilites());
    }
}
