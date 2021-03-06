package esgi.infrastructure.salle;

import esgi.common.dto.creneau.CreneauDto;
import esgi.common.dto.salle.SalleDto;
import esgi.model.entretien.SalleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SalleFake implements SalleRepository {

    public List<SalleDto> salleDtos = new ArrayList<>();

    @Override
    public SalleDto findById(String id) throws Exception {
        Optional<SalleDto> salleDtoOptional = salleDtos
            .stream()
            .filter(salleDto -> id.equals(salleDto.getId()))
            .findFirst();
        if(salleDtoOptional.isPresent())
            return salleDtoOptional.get();
        else
            throw new Exception("Salle introuvable");
    }

    @Override
    public SalleDto save(SalleDto objectSaved) throws Exception {
        OptionalInt index = IntStream.range(0, salleDtos.size())
            .filter(value -> objectSaved.getId().equals(salleDtos.get(value).getId()))
            .findFirst();

        if(index.isPresent()) {
            salleDtos.set(index.getAsInt(), objectSaved);
        } else {
            salleDtos.add(objectSaved);
        }
        return objectSaved;
    }

    @Override
    public List<SalleDto> findSallesDisponibles(CreneauDto creneau) throws Exception {
        List<SalleDto> salleDtos = this.salleDtos
            .stream()
            .filter(salleDto -> salleDto.getDisponibilites().contains(creneau))
            .collect(Collectors.toList());

        if(!salleDtos.isEmpty())
            return salleDtos;
        else
            throw new Exception("Pas de candidat disponible");
    }
}
