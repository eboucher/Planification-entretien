package esgi.model.entretien;

import esgi.common.dto.salle.SalleDto;

public class SalleMap {
    public static SalleDto toDto(Salle salle) {
        return new SalleDto(salle.getDisponibilites());
    }

    public static Salle toModel(SalleDto salleDto) {
        return new Salle(salleDto.getDisponibilites());
    }
}
