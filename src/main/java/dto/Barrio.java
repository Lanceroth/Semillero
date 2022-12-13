package dto;

public class Barrio {
    private int idB;

    public Barrio(int idB, String nom) {
        this.idB = idB;
        this.nom = nom;
    }

    public int getIdB() {
        return idB;
    }

    public void setIdB(int idB) {
        this.idB = idB;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;

}
