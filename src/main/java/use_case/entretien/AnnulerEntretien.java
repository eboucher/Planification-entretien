package use_case.entretien;

import common.dto.entretien.EntretienDto;
import model.entretien.Entretien;
import model.entretien.EntretienMap;
import model.entretien.EntretienRepository;

public class AnnulerEntretien {

    EntretienRepository entretienRepository;

    public AnnulerEntretien(EntretienRepository entretienRepository) {
        this.entretienRepository = entretienRepository;
    }

    public void annuler(Integer entretienId) throws Exception {
        EntretienDto entretienDto = this.entretienRepository.findById(entretienId);

        Entretien entretien = EntretienMap.toModel(entretienDto);
        entretien.annuler();

        EntretienDto entretienDtoModified = EntretienMap.toDto(entretien);

        entretienRepository.save(entretienDtoModified);
    }

}
