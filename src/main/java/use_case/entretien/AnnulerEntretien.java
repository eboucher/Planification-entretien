package use_case.entretien;

import model.entretien.EntretienRepository;

public class AnnulerEntretien {

    EntretienRepository entretienRepository;

    public AnnulerEntretien(EntretienRepository entretienRepository) {
        this.entretienRepository = entretienRepository;
    }

    public void annuler() {

    }

}
