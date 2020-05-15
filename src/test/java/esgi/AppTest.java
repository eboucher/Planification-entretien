package esgi;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.salle.SalleDto;
import esgi.infrastructure.candidat.CandidatFake;
import esgi.infrastructure.consultant.ConsultantFake;
import esgi.infrastructure.entretien.EntretienFake;
import esgi.infrastructure.salle.SalleFake;
import esgi.model.common.EntretienStatus;
import esgi.model.entretien.Entretien;
import esgi.use_case.entretien.AnnulerEntretien;
import esgi.use_case.entretien.PlanifierEntretien;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void planifierEntretien() {
        CandidatFake candidatFake = new CandidatFake();
        ConsultantFake consultantFake = new ConsultantFake();
        EntretienFake entretienFake = new EntretienFake();
        SalleFake salleFake = new SalleFake();

        PlanifierEntretien planifierEntretien = new PlanifierEntretien(candidatFake, consultantFake, entretienFake, salleFake);

        CreneauDto creneauDto = new CreneauDto(
            LocalDateTime.of(LocalDate.of(2020, Month.MAY, 16), LocalTime.of(12, 0)),
            LocalDateTime.of(LocalDate.of(2020, Month.MAY, 16), LocalTime.of(15, 0))
        );

        // Ajouter un candidat dans la bdd
        UUID candidatId = UUID.randomUUID();
        candidatFake.candidatDtos.add(
            new CandidatDto(
                candidatId.toString(),
                Arrays.asList("typescript", "go", "erlang"),
                "",
                Collections.singletonList(creneauDto)
            )
        );

        // Ajouter un consultant dans la bdd
        UUID consultantId = UUID.randomUUID();
        consultantFake.consultantDtos.add(
            new ConsultantDto(
                consultantId.toString(),
                "Estebain",
                Arrays.asList("node", "beau parleur", "erlang"),
                Collections.singletonList(creneauDto)
            )
        );

        // Ajouter une salle dans la bdd
        UUID salleId = UUID.randomUUID();
        salleFake.salleDtos.add(
            new SalleDto(
                salleId.toString(),
                Collections.singletonList(creneauDto)
            )
        );

        try {
            planifierEntretien.planifier(candidatId.toString(), creneauDto);
            // System.out.println(entretienFake.entretienDtos.get(0));
            assertEquals(entretienFake.entretienDtos.get(0).getEntretienStatus(), EntretienStatus.PLANIFIER);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

//    @Test
//    public void annulerEntretien() {
//        CandidatFake candidatFake = new CandidatFake();
//        ConsultantFake consultantFake = new ConsultantFake();
//        EntretienFake entretienFake = new EntretienFake();
//        SalleFake salleFake = new SalleFake();
//
//        PlanifierEntretien planifierEntretien = new PlanifierEntretien(candidatFake, consultantFake, entretienFake, salleFake);
//
//        CreneauDto creneauDto = new CreneauDto(
//            LocalDateTime.of(LocalDate.of(2020, Month.MAY, 16), LocalTime.of(12, 0)),
//            LocalDateTime.of(LocalDate.of(2020, Month.MAY, 16), LocalTime.of(15, 0))
//        );
//
//        // Ajouter un candidat dans la bdd
//        UUID candidatId = UUID.randomUUID();
//        candidatFake.candidatDtos.add(
//            new CandidatDto(
//                candidatId.toString(),
//                Arrays.asList("typescript", "go", "erlang"),
//                "",
//                Collections.singletonList(creneauDto)
//            )
//        );
//
//        // Ajouter un consultant dans la bdd
//        UUID consultantId = UUID.randomUUID();
//        consultantFake.consultantDtos.add(
//            new ConsultantDto(
//                consultantId.toString(),
//                "Estebain",
//                Arrays.asList("node", "beau parleur", "erlang"),
//                Collections.singletonList(creneauDto)
//            )
//        );
//
//        // Ajouter une salle dans la bdd
//        UUID salleId = UUID.randomUUID();
//        salleFake.salleDtos.add(
//            new SalleDto(
//                salleId.toString(),
//                Collections.singletonList(creneauDto)
//            )
//        );
//
//        try {
//            planifierEntretien.planifier(candidatId.toString(), creneauDto);
//            AnnulerEntretien annulerEntretien = new AnnulerEntretien(entretienFake);
//            String idEntretien = entretienFake.entretienDtos.get(0).getId();
//            annulerEntretien.annuler(idEntretien);
//            // System.out.println(entretienFake.entretienDtos.get(0));
//            assertEquals(entretienFake.entretienDtos.get(0).getEntretienStatus(), EntretienStatus.ANNULER);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
}
