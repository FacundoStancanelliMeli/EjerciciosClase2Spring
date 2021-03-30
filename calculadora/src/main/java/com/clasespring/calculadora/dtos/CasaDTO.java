package com.clasespring.calculadora.dtos;

import com.clasespring.calculadora.service.CalculadoraService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.List;

public class CasaDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;

    public CasaDTO(String nombre, String direccion, List<HabitacionDTO> habitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
    }

    public Double devolverArea(){
        return CalculadoraService.calcularArea(this.habitaciones);
    }

    public Double devolverValorCasa(double valorM2){
        return CalculadoraService.valorCasa(devolverArea(), valorM2);
    }

    public HabitacionDTO devolverHabitacionMasGrande(){
        return CalculadoraService.obtenerHabitacionMax(habitaciones);
    }

    public Double[] devolverM2PorHabitacion(){
        return CalculadoraService.obtenerMetro2(habitaciones);
    }
}
