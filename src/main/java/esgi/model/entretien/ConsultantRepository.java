package esgi.model.entretien;

import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.model.common.Repository;

import java.util.List;

public interface ConsultantRepository extends Repository<ConsultantDto> {
    List<ConsultantDto> findConsultantsDisponibles(CreneauDto creneau) throws Exception;
}
