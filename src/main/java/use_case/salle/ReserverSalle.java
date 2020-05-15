package use_case.salle;

import model.entretien.EntretienRepository;
import model.entretien.ReservationSalleRepository;

public class ReserverSalle {
    ReservationSalleRepository reservationSalleRepository;

    public ReserverSalle(ReservationSalleRepository reservationSalleRepository) {
        this.reservationSalleRepository = reservationSalleRepository;
    }

    public void reserver() {

    }
}
