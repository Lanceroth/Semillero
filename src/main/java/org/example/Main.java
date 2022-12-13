package org.example;

import dto.Barrio;
import dto.Ciudad;
import dto.Estudiante;
import dto.Pais;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

/*
        Barrio brr = new Barrio();
        brr.setIdB(1); brr.setNom("Las viñas");

        Barrio brr2 = new Barrio();
        brr2.setIdB(2); brr2.setNom("Casita nueva");

        System.out.println(brr2.getNom());*/

        /*Ciudad ciu =new Ciudad();
        ciu.setIdC(1); ciu.setNom("Monteria"); ciu.setDp("Cordoba");

        Ciudad ciu2 =new Ciudad();
        ciu2.setIdC(2); ciu2.setNom("Planeta rica"); ciu2.setDp("cordoba");

        Pais pa = new Pais();
        pa.setIdP(1); pa.setNom("Colombia"); pa.setInd("+57");

        Pais pa2 = new Pais();
        pa2.setIdP(2); pa2.setNom("Brazil"); pa2.setInd("+64");

        */

        List barrios = new ArrayList<Barrio>();
        Barrio barrio1 = new Barrio(01,"Las viñas");
        Barrio barrio2 = new Barrio(02,"Casita nueva");
        barrios.add(barrio1);
        barrios.add(barrio2);

        List ciudades = new ArrayList<Ciudad>();
        Ciudad ciudad1 = new Ciudad(01,"monteria",barrios);
        Ciudad ciudad2 = new Ciudad(02,"Planeta rica",barrios);
        ciudades.add(ciudad1);
        ciudades.add(ciudad2);

        List paises = new ArrayList<Pais>();
        Pais pais1 = new Pais(01,"colombia","+57",ciudades);
        paises.add(pais1);

        System.out.println(pais1.getCiudades().get(01).getBarrios().get(01).getNom());

        List estudiantes = new ArrayList<Estudiante>();
        Estudiante estu1 = new Estudiante(1,"Juan","Torres");
        Estudiante estu2 = new Estudiante(2,"marta","giraldo");
        estudiantes.add(estu1);
        estudiantes.add(estu2);











    }


}