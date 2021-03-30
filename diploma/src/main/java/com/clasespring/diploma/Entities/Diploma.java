package com.clasespring.diploma.Entities;

import com.clasespring.diploma.Services.CalcularPromedioService;
import com.clasespring.diploma.Services.GenerarMensaje;

public class Diploma {
    private String mensaje;
    private Alumno alumno;
    private double promedio;

    public Diploma(Alumno alumno) {
        this.alumno = alumno;
    }

    public void generarDiploma(){
        calcularPromedio();
        generarMensaje();
    }

    private void calcularPromedio(){
        this.promedio = CalcularPromedioService.calcularPromedio(alumno);
    }

    private void generarMensaje(){
        this.mensaje = GenerarMensaje.generarMensaje(this.promedio);

    }

    public String getMensaje() {
        return mensaje;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public double getPromedio() {
        return promedio;
    }
}
