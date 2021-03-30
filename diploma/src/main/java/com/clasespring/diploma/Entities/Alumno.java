package com.clasespring.diploma.Entities;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Asignatura> listaAsignatura;

    public Alumno(String nombre, List<Asignatura> listaAsignatura) {
        this.nombre = nombre;
        this.listaAsignatura = listaAsignatura;
    }

    public double devolverNotaEnIndiceI(int i){
        return listaAsignatura.get(i).getNota();
    }

    public int devolverCantidadAsignaturas(){
        return listaAsignatura.size();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Asignatura> getListaAsignatura() {
        List<Asignatura> listaAux = new ArrayList<>(listaAsignatura);
        return listaAux;
    }
}
