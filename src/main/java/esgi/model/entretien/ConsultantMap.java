package esgi.model.entretien;

import esgi.common.dto.consultant.ConsultantDto;

import java.util.UUID;

public class ConsultantMap {

    public static ConsultantDto toDto(Consultant consultant) {
        return new ConsultantDto(consultant.getId().toString(), consultant.getNom(), consultant.getCompetences(), consultant.getDisponibilites());
    }

    public static Consultant toModel(ConsultantDto consultantDto) {
        return new Consultant(UUID.fromString(consultantDto.getId()), consultantDto.getNom(), consultantDto.getCompetences(), consultantDto.getDisponibilites());
    }
}
