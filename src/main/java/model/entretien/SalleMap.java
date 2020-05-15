package model.entretien;

import common.dto.creneau.CreneauDto;
import common.dto.salle.SalleDto;

import java.util.List;
import java.util.stream.Collectors;

public class SalleMap {
    public static SalleDto toDto(Salle salle) {
        return new SalleDto(salle.getDisponibilites());
    }

    public static Salle toModel(SalleDto salleDto) {
        return new Salle(salleDto.getDisponibilites());
    }
}
