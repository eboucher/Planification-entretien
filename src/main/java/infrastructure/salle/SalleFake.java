package infrastructure.salle;

import common.dto.creneau.CreneauDto;
import common.dto.salle.SalleDto;
import model.entretien.SalleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SalleFake implements SalleRepository {

    List<SalleDto> salleDtos = new ArrayList<>();

    @Override
    public SalleDto findById(Integer id) throws Exception {
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
    public SalleDto save(SalleDto objectSaved) {
        salleDtos.add(objectSaved);
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