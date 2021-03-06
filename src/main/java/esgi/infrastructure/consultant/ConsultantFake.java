package esgi.infrastructure.consultant;

import esgi.common.dto.consultant.ConsultantDto;
import esgi.common.dto.creneau.CreneauDto;
import esgi.model.entretien.ConsultantRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsultantFake implements ConsultantRepository {

    public List<ConsultantDto> consultantDtos = new ArrayList<>();

    @Override
    public List<ConsultantDto> findConsultantsDisponibles(CreneauDto creneau) throws Exception {
        List<ConsultantDto> consultantDtos = this.consultantDtos
            .stream()
            .filter(consultantDto -> consultantDto.getDisponibilites().contains(creneau))
            .collect(Collectors.toList());

        if(!consultantDtos.isEmpty())
            return consultantDtos;
        else
            throw new Exception("Pas de consultant disponible");
    }

    @Override
    public ConsultantDto findById(String id) throws Exception {
        Optional<ConsultantDto> consultantDtoOptional = consultantDtos
            .stream()
            .filter(consultantDto -> id.equals(consultantDto.getId()))
            .findFirst();
        if(consultantDtoOptional.isPresent())
            return consultantDtoOptional.get();
        else
            throw new Exception("Consultant introuvable");
    }

    @Override
    public ConsultantDto save(ConsultantDto objectSaved) throws Exception {
        OptionalInt index = IntStream.range(0, consultantDtos.size())
            .filter(value -> objectSaved.getId().equals(consultantDtos.get(value).getId()))
            .findFirst();

        if(index.isPresent()) {
            consultantDtos.set(index.getAsInt(), objectSaved);
        } else {
            consultantDtos.add(objectSaved);
        }
        return objectSaved;
    }

}
