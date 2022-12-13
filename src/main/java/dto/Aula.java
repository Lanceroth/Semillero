package dto;

import java.util.List;

public class Aula {

    private int idA;
    private String cur;
    private List<Estudiante> estudiantes;

    public Aula(int idA, String cur, List<Estudiante> estudiantes) {
        this.idA = idA;
        this.cur = cur;
        this.estudiantes = estudiantes;
    }

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
