package common.dto.salle;

import common.dto.creneau.CreneauDto;

import java.util.List;

public class SalleDto {
    private List<CreneauDto> disponibilites;

    public SalleDto(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }
}
