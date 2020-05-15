package esgi.common.dto.salle;

import esgi.common.dto.creneau.CreneauDto;

import java.util.List;

public class SalleDto {
    private String id;
    private List<CreneauDto> disponibilites;

    public SalleDto(String id, List<CreneauDto> disponibilites) {
        this.id = id;
        this.disponibilites = disponibilites;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }
}
