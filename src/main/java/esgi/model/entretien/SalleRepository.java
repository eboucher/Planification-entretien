package esgi.model.entretien;

import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.salle.SalleDto;
import esgi.model.common.Repository;

import java.util.List;

public interface SalleRepository extends Repository<SalleDto> {
    List<SalleDto> findSallesDisponibles(CreneauDto creneau) throws Exception;
}
