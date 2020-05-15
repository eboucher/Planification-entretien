package model.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.creneau.CreneauDto;
import model.common.Repository;

import java.util.List;

public interface CandidatRepository extends Repository<CandidatDto> {
    List<CandidatDto> findCandidatsDisponibles(CreneauDto creneau) throws Exception;
}
