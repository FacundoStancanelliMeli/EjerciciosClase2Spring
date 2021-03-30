package com.clasespring.diploma.Services;

public class GenerarMensaje {
    public static String generarMensaje(double promedio){
        String mensaje;
        if (promedio > 9){
            mensaje = "Felicitaciones, has obtenido un "+ promedio + " de promedio";
        }
        else{
            mensaje = "Has obtenido un "+ promedio + " de promedio";
        }

        return mensaje;
    }
}
