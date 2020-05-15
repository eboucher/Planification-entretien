package esgi.use_case.entretien;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.entretien.EntretienDto;
import esgi.common.dto.salle.SalleDto;
import esgi.model.entretien.*;

import java.util.List;
import java.util.UUID;

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

    public void planifier(UUID candidatId, CreneauDto creneauDto) throws Exception {
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
        entretien.setSalleId(UUID.fromString(sallesDisponibles.get(0).getId()));

        // Mapping l'entité => entity -> dto
        EntretienDto entretienDto = EntretienMap.toDto(entretien);

        // THEN
        entretienRepository.save(entretienDto /* dto */);
    }
}
