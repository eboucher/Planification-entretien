package use_case.entretien;

import java.util.List;

import model.candidat.Candidat;
import model.consultant.Consultant;
import model.entretien.Entretien;
import model.salle.Salle;
import infrastructure.candidat.CandidatRepository;
import infrastructure.consultant.ConsultantRepository;
import infrastructure.entretien.EntretienRepository;
import infrastructure.salle.SalleRepository;

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

    public void planifier() {
        // GIVEN
        Candidat candidat = candidatRepository.getCandidatById();
        List<Consultant> consultantsDisponible = consultantRepository.getConsultantsDisponible();
        List<Salle> sallesDisponibles = salleRepository.getSallesDisponible();

        // WHEN
        Entretien entretien = new Entretien(candidat, consultantsDisponible, sallesDisponibles);
        // THEN
        entretienRepository.save(entretien);
    }

}