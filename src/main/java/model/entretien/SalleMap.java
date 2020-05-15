package model.entretien;

import common.dto.creneau.CreneauDto;
import common.dto.salle.SalleDto;

import java.util.List;
import java.util.stream.Collectors;

public class SalleMap {
    public static SalleDto toDto(Salle salle) {
        List<CreneauDto> creneauDtos = salle.getDisponibilites()
            .stream()
            .map(CreneauMap::toDto)
            .collect(Collectors.toList());
        return new SalleDto(creneauDtos);
    }

    public static Salle toModel(SalleDto salleDto) {
        List<Creneau> creneauList = salleDto.g
            .stream()
            .map(CreneauMap::toModel)
            .collect(Collectors.toList());
        return new Salle(creneauList);
    }
}
