package infrastructure.reservation_salle;

import common.dto.creneau.CreneauDto;
import common.dto.reservation_salle.ReservationSalleDto;
import model.entretien.ReservationSalleRepository;

import java.util.List;

public class ReservationSalleFake implements ReservationSalleRepository {

    @Override
    public ReservationSalleDto findById(Integer id) {
        return null;
    }

    @Override
    public ReservationSalleDto save(ReservationSalleDto objectSaved) {
        return null;
    }
}
