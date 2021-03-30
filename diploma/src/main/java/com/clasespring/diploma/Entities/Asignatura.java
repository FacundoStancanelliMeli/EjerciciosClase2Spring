package com.clasespring.diploma.Entities;

public class Asignatura {
    private String nombre;
    private double nota;

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }
}
