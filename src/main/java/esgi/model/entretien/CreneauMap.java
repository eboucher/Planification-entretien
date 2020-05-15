package esgi.model.entretien;

import esgi.common.dto.creneau.CreneauDto;

public class CreneauMap {

    public static CreneauDto toDto(Creneau creneau) {
        return new CreneauDto(creneau.getStartDate(), creneau.getEndDate());
    }

    public static Creneau toModel(CreneauDto creneauDto) {
        return new Creneau(creneauDto.getStartDate(), creneauDto.getEndDate());
    }
}
