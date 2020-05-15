package model.entretien;

import java.util.List;

import common.dto.creneau.CreneauDto;
import common.dto.salle.SalleDto;
import model.common.Repository;

public interface SalleRepository extends Repository<SalleDto>{
    List<SalleDto> getSallesDisponibles(CreneauDto creneau);
}
