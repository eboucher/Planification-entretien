package use_case.entretien;

import java.util.List;

import model.candidat.Candidat;
import model.consultant.Consultant;
import model.salle.Salle;
import repository.candidat.CandidatRepository;
import repository.consultant.ConsultantRepository;
import repository.entretien.EntretienRepository;
import repository.salle.SalleRepository;

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
        List<Consultant> consultantsDisponible = consultantRepository.getConsultantDisponible();
        List<Salle> sallesDisponibles = salleRepository.getSallesDisponible();
        // WHEN
        
        // THEN
    }

}