package use_case.entretien;

import infrastructure.entretien.EntretienRepository;

public class CreerEntretien {

    private EntretienRepository entretienRepository;

    CreerEntretien(EntretienRepository entretienRepository) {
        this.entretienRepository = entretienRepository;
    }

    void create() {
        
    }

}