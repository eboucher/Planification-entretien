package esgi.use_case.entretien;

import esgi.common.dto.entretien.EntretienDto;
import esgi.model.entretien.Entretien;
import esgi.model.entretien.EntretienMap;
import esgi.model.entretien.EntretienRepository;

import java.util.UUID;

public class AnnulerEntretien {

    EntretienRepository entretienRepository;

    public AnnulerEntretien(EntretienRepository entretienRepository) {
        this.entretienRepository = entretienRepository;
    }

    public void annuler(UUID entretienId) throws Exception {
        EntretienDto entretienDto = this.entretienRepository.findById(entretienId);

        Entretien entretien = EntretienMap.toModel(entretienDto);
        entretien.annuler();

        EntretienDto entretienDtoModified = EntretienMap.toDto(entretien);

        entretienRepository.save(entretienDtoModified);
    }

}
