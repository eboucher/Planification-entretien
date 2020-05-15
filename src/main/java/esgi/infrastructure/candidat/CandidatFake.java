package esgi.infrastructure.candidat;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.model.entretien.CandidatRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CandidatFake implements CandidatRepository {

    List<CandidatDto> candidatDtos = new ArrayList<>();

    @Override
    public List<CandidatDto> findCandidatsDisponibles(CreneauDto creneau) throws Exception {
        List<CandidatDto> candidatDtos = this.candidatDtos
            .stream()
            .filter(candidatDto -> candidatDto.getDisponibilites().contains(creneau))
            .collect(Collectors.toList());
        if(candidatDtos.isEmpty())
            return candidatDtos;
        else
            throw new Exception("Pas de candidat disponible");
    }

    @Override
    public CandidatDto findById(Integer id) throws Exception{
        Optional<CandidatDto> candidatDtoOptionnal = candidatDtos
            .stream()
            .filter(candidatDto -> id.equals(candidatDto.getId()))
            .findFirst();
        if(candidatDtoOptionnal.isPresent())
            return candidatDtoOptionnal.get();
        else
            throw new Exception("Candidat introuvable");
    }

    @Override
    public CandidatDto save(CandidatDto objectSaved) {
        candidatDtos.add(objectSaved);
        return objectSaved;
    }
}
