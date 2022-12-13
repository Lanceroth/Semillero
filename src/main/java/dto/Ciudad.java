package dto;

import java.util.List;

public class Ciudad {
    private int idC;
    private String nom;
    private List<Barrio> barrios;

    public Ciudad(int idC, String nom, List<Barrio> barrios) {
        this.idC = idC;
        this.nom = nom;
        this.barrios = barrios;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(List<Barrio> barrios) {
        this.barrios = barrios;
    }
}
