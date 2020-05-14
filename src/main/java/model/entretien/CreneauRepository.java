package model.entretien;

import model.common.Repository;

public interface CreneauRepository extends Repository<Creneau> {
    Creneau findByDate();
}