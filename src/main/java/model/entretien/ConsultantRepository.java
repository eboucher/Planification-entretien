package model.entretien;

import java.util.List;

import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import model.common.Repository;

public interface ConsultantRepository extends Repository<ConsultantDto> {
    List<ConsultantDto> findConsultantsDisponibles(CreneauDto creneau);
}
