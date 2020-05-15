package model.entretien;

import common.dto.creneau.CreneauDto;

public class CreneauMap {

    public static CreneauDto toDto(Creneau entity) {
        return new CreneauDto(entity.getStartDate(), entity.getEndDate());
    }

    public static Creneau toModel(CreneauDto creneauDto) {
        return new Creneau(creneauDto.getStartDate(), creneauDto.getEndDate());
    }
}
