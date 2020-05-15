package esgi.infrastructure.entretien;

import esgi.common.dto.entretien.EntretienDto;
import esgi.model.entretien.EntretienRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EntretienFake implements EntretienRepository {

    public List<EntretienDto> entretienDtos = new ArrayList<>();

    @Override
    public EntretienDto findById(Integer id) throws Exception {
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
    public EntretienDto save(EntretienDto objectSaved) {
        entretienDtos.add(objectSaved);
        return objectSaved;
    }
}
