package model.entretien;

import common.dto.creneau.CreneauDto;
import common.dto.salle.SalleDto;
import model.common.Repository;

import java.util.List;

public interface SalleRepository extends Repository<SalleDto>{
    List<SalleDto> getSallesDisponibles(CreneauDto creneau);
}
