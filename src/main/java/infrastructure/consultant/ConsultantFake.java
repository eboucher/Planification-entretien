package infrastructure.consultant;

import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import model.entretien.ConsultantRepository;

import java.util.List;

public class ConsultantFake implements ConsultantRepository {

    @Override
    public List<ConsultantDto> findConsultantsDisponibles(CreneauDto creneau) {
        return null;
    }

    @Override
    public ConsultantDto findById(Integer id) {
        return null;
    }

    @Override
    public ConsultantDto save(ConsultantDto objectSaved) {
        return null;
    }

}
