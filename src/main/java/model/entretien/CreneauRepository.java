package model.entretien;

import common.dto.creneau.CreneauDto;
import model.common.Repository;

public interface CreneauRepository extends Repository<CreneauDto> {
    CreneauDto findByDate();
}
