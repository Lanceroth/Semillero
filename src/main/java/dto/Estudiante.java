package dto;

public class Estudiante {
    private int idEst;
    private String nom;
    private String ape;

    public Estudiante(int idEst, String nom, String ape) {
        this.idEst = idEst;
        this.nom = nom;
        this.ape = ape;
    }

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
}
