package infrastructure.salle;

import common.dto.creneau.CreneauDto;
import common.dto.salle.SalleDto;
import model.entretien.SalleRepository;

import java.util.List;

public class SalleFake implements SalleRepository {

    @Override
    public List<SalleDto> getSallesDisponibles(CreneauDto creneau) {
        return null;
    }

    @Override
    public SalleDto findById(Integer id) {
        return null;
    }

    @Override
    public SalleDto save(SalleDto objectSaved) {
        return null;
    }
}
