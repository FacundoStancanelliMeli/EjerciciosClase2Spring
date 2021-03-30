package com.clasespring.calculadora.controller;

import com.clasespring.calculadora.dtos.CasaDTO;
import com.clasespring.calculadora.dtos.HabitacionDTO;
import com.clasespring.calculadora.service.CalculadoraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


    @PostMapping("/areaCasa")
    public ResponseEntity calcularArea(@RequestBody CasaDTO casa){
        return new ResponseEntity("{area:"+ casa.devolverArea() +"}", HttpStatus.OK);
    }
    @PostMapping("/valorcasa")
    public ResponseEntity valorCasa(@RequestBody CasaDTO casa){
        return new ResponseEntity("{valorCasa:"+ casa.devolverValorCasa(800) +"}", HttpStatus.OK);
    }

    @PostMapping("/maxhabitacion")
    public ResponseEntity habitacionMax(@RequestBody CasaDTO casa){
        return new ResponseEntity(casa.devolverHabitacionMasGrande(), HttpStatus.OK);
    }
    @PostMapping("/metroscuadrados")
    public ResponseEntity obtenerMetros2(@RequestBody CasaDTO casa){
        return new ResponseEntity(casa.devolverM2PorHabitacion(), HttpStatus.OK);
    }
}
