package esgi.infrastructure.candidat;

import esgi.common.dto.candidat.CandidatDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.model.entretien.CandidatRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CandidatFake implements CandidatRepository {

    public List<CandidatDto> candidatDtos = new ArrayList<>();

    @Override
    public List<CandidatDto> findCandidatsDisponibles(CreneauDto creneau) throws Exception {
        List<CandidatDto> candidatDtos = this.candidatDtos
            .stream()
            .filter(candidatDto -> candidatDto.getDisponibilites().contains(creneau))
            .collect(Collectors.toList());
        if(!candidatDtos.isEmpty())
            return candidatDtos;
        else
            throw new Exception("Pas de candidat disponible");
    }

    @Override
    public CandidatDto findById(String id) throws Exception{
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
    public CandidatDto save(CandidatDto objectSaved) throws Exception {
        OptionalInt index = IntStream.range(0, candidatDtos.size())
            .filter(value -> objectSaved.getId().equals(candidatDtos.get(value).getId()))
            .findFirst();

        if(index.isPresent()) {
            candidatDtos.set(index.getAsInt(), objectSaved);
        } else {
            candidatDtos.add(objectSaved);
        }
        return objectSaved;
    }
}
