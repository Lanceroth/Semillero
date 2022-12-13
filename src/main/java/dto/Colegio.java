package dto;

import java.util.List;

public class Colegio {
    private int idCol;
    private String nomCol;
    private List<Colegio> colegios;

    public Colegio(int idCol, String nomCol, List<Colegio> colegios) {
        this.idCol = idCol;
        this.nomCol = nomCol;
        this.colegios = colegios;
    }

    public int getIdCol() {
        return idCol;
    }

    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }

    public String getNomCol() {
        return nomCol;
    }

    public void setNomCol(String nomCol) {
        this.nomCol = nomCol;
    }

    public List<Colegio> getColegios() {
        return colegios;
    }

    public void setColegios(List<Colegio> colegios) {
        this.colegios = colegios;
    }
}
