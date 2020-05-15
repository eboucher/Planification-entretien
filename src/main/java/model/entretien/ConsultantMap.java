package model.entretien;

import common.dto.consultant.ConsultantDto;

public class ConsultantMap {

    public static ConsultantDto toDto(Consultant entity) {
        return new ConsultantDto(entity.getNom(), entity.getCompetences());
    }

    public static Consultant toModel(ConsultantDto consultantDto) {
        return new Consultant(consultantDto.getNom(), consultantDto.getCompetences());
    }
}
