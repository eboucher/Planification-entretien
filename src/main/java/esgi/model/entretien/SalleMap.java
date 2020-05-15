package esgi.model.entretien;

import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.salle.SalleDto;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class SalleMap {
    public static SalleDto toDto(Salle salle) {
        List<CreneauDto> creneauDtos = salle.getDisponibilites()
            .stream()
            .map(CreneauMap::toDto)
            .collect(Collectors.toList());
        return new SalleDto(salle.getId().toString(), creneauDtos);
    }

    public static Salle toModel(SalleDto salleDto) {
        List<Creneau> creneauList = salleDto.getDisponibilites()
            .stream()
            .map(CreneauMap::toModel)
            .collect(Collectors.toList());
        return new Salle(UUID.fromString(salleDto.getId()), creneauList);
    }
}
