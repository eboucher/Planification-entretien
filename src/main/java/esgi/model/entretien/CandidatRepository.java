package esgi.model.entretien;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.model.common.Repository;

import java.util.List;

public interface CandidatRepository extends Repository<CandidatDto> {
    List<CandidatDto> findCandidatsDisponibles(CreneauDto creneau) throws Exception;
}
