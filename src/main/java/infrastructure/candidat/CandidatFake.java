package infrastructure.candidat;

import common.dto.candidat.CandidatDto;
import common.dto.creneau.CreneauDto;
import model.entretien.CandidatRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CandidatFake implements CandidatRepository {

    @Override
    public CandidatDto findById(Integer id) {
        List<String> competences = new ArrayList<>();
        competences.add("typescript");
        competences.add("node");
        List<CreneauDto> creneauDtos = new ArrayList<>();
        creneauDtos.add(new CreneauDto(new Date(), new Date()));
        return new CandidatDto(1, competences, "", creneauDtos);
    }

    @Override
    public CandidatDto save(CandidatDto objectSaved) {
        System.out.println("Candidat saved");
        return null;
    }
}
