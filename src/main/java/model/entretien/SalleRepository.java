package model.entretien;

import java.util.List;

import model.common.Repository;

public interface SalleRepository extends Repository<Salle>{
    List<Salle> getSallesDisponibles(Creneau creneau);
}