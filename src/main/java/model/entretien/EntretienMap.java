package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import common.dto.entretien.EntretienDto;

import java.util.List;
import java.util.stream.Collectors;

public class EntretienMap {

    public static EntretienDto toDto(Entretien entretien) {
        CandidatDto candidatDto = CandidatMap.toDto(entretien.getCandidat());
        List<ConsultantDto> consultantDtoList = entretien.getConsultant()
            .stream()
            .map(ConsultantMap::toDto)
            .collect(Collectors.toList());
        CreneauDto creneauDto = CreneauMap.toDto(entretien.getCreneau());
        return new EntretienDto(candidatDto, consultantDtoList, creneauDto);
    }

    public static Entretien toModel(EntretienDto entretienDto) {
        Candidat candidatList = CandidatMap.toModel(entretienDto.getCandidat());
        List<Consultant> consultantList = entretienDto.getConsultant()
            .stream()
            .map(ConsultantMap::toModel)
            .collect(Collectors.toList());
        Creneau creneau = CreneauMap.toModel(entretienDto.getCreneau());
        //TODO: id ?
        return new Entretien(candidatList, consultantList, creneau);
    }
}
