package com.clasespring.calculadora.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class HabitacionDTO {
    private String nombre;
    private Double ancho;
    private Double largo;

    public HabitacionDTO(String nombre, Double ancho, Double largo) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getLargo() {
        return largo;
    }
}
