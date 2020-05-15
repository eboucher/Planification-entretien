package use_case.entretien;

import common.dto.candidat.CandidatDto;
import common.dto.consultant.ConsultantDto;
import common.dto.creneau.CreneauDto;
import common.dto.entretien.EntretienDto;
import common.dto.salle.SalleDto;
import model.entretien.*;

import java.util.List;

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

    public void planifier(Integer candidatId, CreneauDto creneauDto) throws Exception {
        // GIVEN
        CandidatDto candidatDto = candidatRepository.findById(candidatId);
        List<ConsultantDto> consultantsDisponiblesDtos = consultantRepository.findConsultantsDisponibles(creneauDto);

        // WHEN
        // Passer des dto - Construire les objets metiers dans le constructeur d'entretien
        // Manipuler l'entité
        Entretien entretien = new Entretien(candidatDto, consultantsDisponiblesDtos, creneauDto);
        entretien.planifier();

        // appler la Salle Repository
        // Appeler reserverSalle
        List<SalleDto> sallesDisponibles = this.salleRepository.findSallesDisponibles(creneauDto);
        // Prendre l'id de la salle reservé, setter dans l'entretien
        entretien.setSalleId(sallesDisponibles.get(0).getId());

        // Mapping l'entité => entity -> dto
        EntretienDto entretienDto = EntretienMap.toDto(entretien);

        // THEN
        entretienRepository.save(entretienDto /* dto */);
    }
}
