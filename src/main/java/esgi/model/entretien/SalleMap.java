package esgi.model.entretien;

import esgi.common.dto.salle.SalleDto;

import java.util.UUID;

public class SalleMap {
    public static SalleDto toDto(Salle salle) {
        return new SalleDto(salle.getId().toString() , salle.getDisponibilites());
    }

    public static Salle toModel(SalleDto salleDto) {
        return new Salle(UUID.fromString(salleDto.getId()), salleDto.getDisponibilites());
    }
}
