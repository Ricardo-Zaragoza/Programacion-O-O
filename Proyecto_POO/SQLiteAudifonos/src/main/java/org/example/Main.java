package org.example;

import Controlador.ControladorAudifono;
import Vista.VentanaAudifonos;

public class Main {
    public static void main(String[] args) {

         VentanaAudifonos view  = new VentanaAudifonos("Audifonos");
        ControladorAudifono controller  = new ControladorAudifono(view);
    }

}