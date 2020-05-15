package model.entretien;

import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import model.common.Repository;

import java.util.List;

public interface ConsultantRepository extends Repository<ConsultantDto> {
    List<ConsultantDto> findConsultantsDisponibles(CreneauDto creneau);
}
