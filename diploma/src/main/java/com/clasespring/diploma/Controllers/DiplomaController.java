package com.clasespring.diploma.Controllers;

import com.clasespring.diploma.Entities.Alumno;
import com.clasespring.diploma.Entities.Diploma;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @PostMapping("/generarDiploma")
    public Diploma generarDiploma(@RequestBody Alumno alumno){
        Diploma diploma = new Diploma(alumno);
        diploma.generarDiploma();
        return diploma;
    }
}
