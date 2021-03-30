package com.clasespring.calculadora.service;


import com.clasespring.calculadora.dtos.HabitacionDTO;
import lombok.Data;

import java.util.List;

public class CalculadoraService {

    public static Double calcularArea(List<HabitacionDTO> habitaciones){

        double aux=0;
        for(HabitacionDTO habitacion: habitaciones){
            aux+=habitacion.getAncho() * habitacion.getLargo();
        }
        return aux;
    }


    public static Double calcularArea(HabitacionDTO habitaciones){
        return habitaciones.getLargo()*habitaciones.getAncho();
    }


    public static Double valorCasa(Double area, Double valorM2){
        return area * valorM2;
    }

    public static HabitacionDTO obtenerHabitacionMax(List<HabitacionDTO> habitaciones){

        HabitacionDTO habitacion = null;
        double max=0;
        for(int i=0; i<habitaciones.size(); i++){
            if(calcularArea(habitaciones.get(i))>max){
                habitacion=habitaciones.get(i);
                max=calcularArea(habitaciones.get(i));
            }
        }
        return habitacion;
    }
    public static Double[] obtenerMetro2(List<HabitacionDTO> habitaciones){

        Double arr[] = new Double[habitaciones.size()];
        for(int i=0; i<habitaciones.size(); i++){
            arr[i]=calcularArea(habitaciones.get(i));
        }
        return arr;
    }

}
