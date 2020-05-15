package use_case.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import common.dto.entretien.EntretienDto;
import common.dto.salle.SalleDto;
import model.entretien.*;

import java.util.List;
import java.util.stream.Collectors;

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

    public void planifier(Integer candidatId, CreneauDto creneau) {
        // GIVEN
        CandidatDto candidatDto = candidatRepository.findById(candidatId);
        List<ConsultantDto> consultantsDisponiblesDtos = consultantRepository.findConsultantsDisponibles(creneau);

        // WHEN
        // Passer des dto - Construire les objets metiers dans le constructeur d'entretien
        // Manipuler l'entité
        Entretien entretien = new Entretien(candidatDto, consultantsDisponiblesDtos);
        entretien.planifier();

        // Mapping l'entité => entity -> dto
        EntretienDto entretienDto = EntretienMap.toDto(entretien);

        // THEN
        entretienRepository.save(entretienDto /* dto */);
    }
}
