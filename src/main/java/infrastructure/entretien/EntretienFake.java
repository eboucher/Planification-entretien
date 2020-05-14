package infrastructure.entretien;

import java.util.List;

import model.candidat.Candidat;
import model.consultant.Consultant;
import model.creneau.Creneau;
import model.entretien.EntretienRepository;
import model.salle.Salle;

public class EntretienFake implements EntretienRepository {

    @Override
    public Candidat getCandidat() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Consultant> getConsultants() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Creneau getCreneau() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Salle> getSalles() {
        // TODO Auto-generated method stub
        return null;
    }
    
}