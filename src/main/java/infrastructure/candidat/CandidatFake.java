package infrastructure.candidat;

import common.dto.candidat.CandidatDto;
import model.entretien.CandidatRepository;

public class CandidatFake implements CandidatRepository {

    @Override
    public CandidatDto findById(Integer id) {
        return null;
    }

    @Override
    public CandidatDto save(CandidatDto objectSaved) {
        return null;
    }
}
