package common.dto.consultant;

import java.util.List;

public class ConsultantDto {
    private Integer id;
    private String nom;
    private List<String> competences;

    public ConsultantDto(Integer id, String nom, List<String> competences) {
        this.id = id;
        this.nom = nom;
        this.competences = competences;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }
}
