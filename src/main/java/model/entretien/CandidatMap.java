package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.creneau.CreneauDto;

import java.util.List;
import java.util.stream.Collectors;

public class CandidatMap {

    public static CandidatDto toDto(Candidat candidat) {
        List<CreneauDto> creneauDtos =
            candidat.getDisponibilites()
                .stream()
                .map(CreneauMap::toDto)
                .collect(Collectors.toList());
        return new CandidatDto(candidat.getCompetences(), candidat.getCv(), creneauDtos);
    }

    public static Candidat toModel(CandidatDto candidatDto) {
        List<Creneau> creneauList =
            candidatDto.getDisponibilites()
                .stream()
                .map(CreneauMap::toModel)
                .collect(Collectors.toList());
        return new Candidat(candidatDto.getCompetences(), candidatDto.getCv(), creneauList);
    }
}
