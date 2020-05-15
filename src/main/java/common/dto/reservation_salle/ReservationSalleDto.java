package common.dto.reservation_salle;

import common.dto.salle.SalleDto;

import java.util.List;

public class ReservationSalleDto {
    private List<SalleDto> sallesDisponibles;
    private SalleDto salle;

    public ReservationSalleDto(List<SalleDto> sallesDisponibles, SalleDto salle) {
        this.sallesDisponibles = sallesDisponibles;
        this.salle = salle;
    }

    public List<SalleDto> getSallesDisponibles() {
        return sallesDisponibles;
    }

    public void setSallesDisponibles(List<SalleDto> sallesDisponibles) {
        this.sallesDisponibles = sallesDisponibles;
    }

    public SalleDto getSalle() {
        return salle;
    }

    public void setSalle(SalleDto salle) {
        this.salle = salle;
    }
}
