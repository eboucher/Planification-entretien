package model.entretien;

import common.dto.reservation_salle.ReservationSalleDto;
import common.dto.salle.SalleDto;

import java.util.List;
import java.util.stream.Collectors;

public class ReservationSalleMap {

    public static ReservationSalleDto toDto(ReservationSalle reservationSalle) {
        List<SalleDto> salleDtoList = reservationSalle.getSallesDisponibles()
            .stream()
            .map(SalleMap::toDto)
            .collect(Collectors.toList());
        SalleDto salleDto = SalleMap.toDto(reservationSalle.getSalle());
        return new ReservationSalleDto(salleDtoList, salleDto);
    }

    public static ReservationSalle toModel(ReservationSalleDto reservationSalle) {
        List<Salle> salleList = reservationSalle.getSallesDisponibles()
            .stream()
            .map(SalleMap::toModel)
            .collect(Collectors.toList());
        Salle salle = SalleMap.toModel(reservationSalle.getSalle());
        return new ReservationSalle(salleList, salle);
    }
}
