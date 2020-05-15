package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.creneau.CreneauDto;

import java.util.List;
import java.util.stream.Collectors;

public class CandidatMap {

    public static CandidatDto toDto(Candidat candidat) {
        return new CandidatDto(candidat.getId(), candidat.getCompetences(), candidat.getCv(), candidat.getDisponibilites());
    }

    public static Candidat toModel(CandidatDto candidatDto) {
        return new Candidat(candidatDto.getId(), candidatDto.getCompetences(), candidatDto.getCv(), candidatDto.getDisponibilites());
    }
}
