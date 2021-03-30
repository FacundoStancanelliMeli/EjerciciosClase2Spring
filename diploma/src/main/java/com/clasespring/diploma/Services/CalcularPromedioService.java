package com.clasespring.diploma.Services;

import com.clasespring.diploma.Entities.Alumno;

public class CalcularPromedioService {
    public static double calcularPromedio(Alumno alumno){
        double prom = 0;
        for(int i = 0; i < alumno.devolverCantidadAsignaturas(); i++){
            prom+=alumno.devolverNotaEnIndiceI(i);
        }

        return prom/alumno.devolverCantidadAsignaturas();
    }
}
