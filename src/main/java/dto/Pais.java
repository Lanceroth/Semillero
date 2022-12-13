package dto;

import java.util.List;

public class Pais {
    private int idP;
    private String nom;
    private String ind;
    private List<Ciudad> ciudades;

    public Pais(int idP, String nom, String ind, List<Ciudad> ciudades) {
        this.idP = idP;
        this.nom = nom;
        this.ind = ind;
        this.ciudades = ciudades;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}


