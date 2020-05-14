package infrastructure.consultant;

import java.util.List;

import model.consultant.Consultant;
import model.consultant.ConsultantRepository;
import model.creneau.Creneau;

public class ConsultantFake implements ConsultantRepository {

    @Override
    public Consultant findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Consultant save(Consultant objectSaved) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Consultant> findConsultantsDisponibles(Creneau creneau) {
        // TODO Auto-generated method stub
        return null;
    }
    
}