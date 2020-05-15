package esgi.infrastructure.entretien;

import esgi.common.dto.entretien.EntretienDto;
import esgi.model.entretien.EntretienRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class EntretienFake implements EntretienRepository {

    public List<EntretienDto> entretienDtos = new ArrayList<>();

    @Override
    public EntretienDto findById(String id) throws Exception {
        Optional<EntretienDto> entretienDtoOptional = entretienDtos
            .stream()
            .filter(entretienDto -> id.equals(entretienDto.getId()))
            .findFirst();
        if(entretienDtoOptional.isPresent())
            return entretienDtoOptional.get();
        else
            throw new Exception("Entretien introuvable");
    }

    @Override
    public EntretienDto save(EntretienDto objectSaved) throws Exception {
        OptionalInt index = IntStream.range(0, entretienDtos.size())
            .filter(value -> objectSaved.getId().equals(entretienDtos.get(value).getId()))
            .findFirst();

        if(index.isPresent()) {
            entretienDtos.set(index.getAsInt(), objectSaved);
        } else {
            entretienDtos.add(objectSaved);
        }
        return objectSaved;
    }
}
