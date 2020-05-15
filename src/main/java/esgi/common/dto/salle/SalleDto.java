package esgi.common.dto.salle;

import esgi.common.dto.creneau.CreneauDto;

import java.util.List;

public class SalleDto {
    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
