package esgi.model.entretien;

import esgi.common.dto.consultant.ConsultantDto;

public class ConsultantMap {

    public static ConsultantDto toDto(Consultant consultant) {
        return new ConsultantDto(consultant.getId(), consultant.getNom(), consultant.getCompetences(), consultant.getDisponibilites());
    }

    public static Consultant toModel(ConsultantDto consultantDto) {
        return new Consultant(consultantDto.getId(), consultantDto.getNom(), consultantDto.getCompetences(), consultantDto.getDisponibilites());
    }
}
