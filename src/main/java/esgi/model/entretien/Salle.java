package esgi.model.entretien;

import esgi.common.dto.creneau.CreneauDto;

import java.util.List;
import java.util.UUID;

class Salle {

    private UUID id;
    private List<CreneauDto> disponibilites;

    public Salle(UUID id, List<CreneauDto> disponibilites) {
        this.id = id;
        this.disponibilites = disponibilites;
    }

    public UUID getId() {
        return id;
    }

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }
}
