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
        Candiat candidat = candidatRepository.getCandidatById();
        List<Consultant> consultantsDisponible = consultantRepository.getConsultantDisponible();
        List<Salle> sallesDisponibles = salleRepository.getSallesDisponible();
        // WHEN
        
        // THEN
    }

}