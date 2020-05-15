package infrastructure.creneau;

import common.dto.creneau.CreneauDto;
import model.entretien.CreneauRepository;

public class CreneauFake implements CreneauRepository {

    @Override
    public CreneauDto findByDate() {
        return null;
    }

    @Override
    public CreneauDto findById(Integer id) {
        return null;
    }

    @Override
    public CreneauDto save(CreneauDto objectSaved) {
        return null;
    }
}
