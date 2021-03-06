package esgi.model.entretien;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.entretien.EntretienDto;
import esgi.model.common.EntretienStatus;

import java.util.List;
import java.util.stream.Collectors;

public class EntretienMap {

    public static EntretienDto toDto(Entretien entretien) {
        CandidatDto candidatDto = CandidatMap.toDto(entretien.getCandidat());
        List<ConsultantDto> consultantDtoList = entretien.getConsultantsDisponibles()
            .stream()
            .map(ConsultantMap::toDto)
            .collect(Collectors.toList());
        CreneauDto creneauDto = CreneauMap.toDto(entretien.getCreneau());
        EntretienStatus entretienStatus = entretien.getEntretienStatus();
        return new EntretienDto(entretien.getId().toString(), candidatDto, consultantDtoList, creneauDto, entretienStatus);
    }

    public static Entretien toModel(EntretienDto entretienDto) {
        Candidat candidatList = CandidatMap.toModel(entretienDto.getCandidat());
        List<Consultant> consultantList = entretienDto.getConsultantsDisponibles()
            .stream()
            .map(ConsultantMap::toModel)
            .collect(Collectors.toList());
        Creneau creneau = CreneauMap.toModel(entretienDto.getCreneau());
        return new Entretien(candidatList, consultantList, creneau);
    }
}
