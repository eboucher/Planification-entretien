package esgi;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.salle.SalleDto;
import esgi.infrastructure.candidat.CandidatFake;
import esgi.infrastructure.consultant.ConsultantFake;
import esgi.infrastructure.entretien.EntretienFake;
import esgi.infrastructure.salle.SalleFake;
import esgi.use_case.entretien.PlanifierEntretien;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;

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
        candidatFake.candidatDtos.add(
            new CandidatDto(
                1,
                Arrays.asList("typescript", "go", "erlang"),
                "",
                Collections.singletonList(creneauDto)
            )
        );

        // Ajouter un consultant dans la bdd
        consultantFake.consultantDtos.add(
            new ConsultantDto(
                1,
                "Estebain",
                Arrays.asList("node", "beau parleur", "erlang"),
                Collections.singletonList(creneauDto)
            )
        );

        // Ajouter une salle dans la bdd
        salleFake.salleDtos.add(
            new SalleDto(
                Collections.singletonList(creneauDto)
            )
        );

        try {
            planifierEntretien.planifier(1, creneauDto);
            assertNotNull(entretienFake.entretienDtos.get(0));
            assertEquals(entretienFake.entretienDtos.get(0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
