package model.salle;

import java.util.List;

import model.creneau.Creneau;

public interface SalleRepository {
    List<Creneau> getDisponibilites();
}