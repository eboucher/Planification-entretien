package use_case.entretien;

import java.util.List;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.salle.SalleDto;
import model.entretien.CandidatRepository;
import model.entretien.ConsultantRepository;
import model.entretien.EntretienRepository;
import model.entretien.SalleRepository;

public class PlanifierEntretien {
    
    private CandidatRepository candidatRepository;
    private ConsultantRepository consultantRepository;
    private EntretienRepository entretienRepository;
    private SalleRepository salleRepository;

    public PlanifierEntretien(
        CandidatRepository candidatRepository,
        ConsultantRepository consultantRepository,
        EntretienRepository entretienRepository,
        SalleRepository salleRepository
    ) {
        this.candidatRepository = candidatRepository;
        this.consultantRepository = consultantRepository;
        this.entretienRepository = entretienRepository;
        this.salleRepository = salleRepository;
    }

    public void planifier(Integer candidatId, Creneau creneau) {
        // GIVEN
        CandidatDto candidat = candidatRepository.findById(candidatId);
        List<ConsultantDto> consultantsDisponible = consultantRepository.findConsultantsDisponibles(creneau);
        List<SalleDto> sallesDisponibles = salleRepository.getSallesDisponibles(creneau);

        // WHEN
        // Passer des dto - Construire les objets metiers dans le constructeur d'entretien
        // Manipuler l'entité
        Entretien entretien = new Entretien(candidat, consultantsDisponible, sallesDisponibles);
        entretien.planifier()

        // Mapping l'entité => entity -> dto


        // THEN
        entretienRepository.save(entretien /* dto */);
    }
}