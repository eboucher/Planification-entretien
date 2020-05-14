package model.entretien;

import java.util.List;
import model.common.Repository;

public interface ConsultantRepository extends Repository<Consultant> {
    List<Consultant> findConsultantsDisponibles(Creneau creneau);
}