package infrastructure.entretien;

import common.dto.entretien.EntretienDto;
import model.entretien.EntretienRepository;

public class EntretienFake implements EntretienRepository {

    @Override
    public EntretienDto findById(Integer id) {
        return null;
    }

    @Override
    public EntretienDto save(EntretienDto objectSaved) {
        return null;
    }
}
