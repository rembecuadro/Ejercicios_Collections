/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import Servicio.ServicioRaza;
import java.util.ArrayList;

/**
 *
 * @author rembe
 */
public class Colecciones_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioRaza raza = new ServicioRaza();
        String nombreRaza = null;
                
        ArrayList<String> razas = raza.crearRaza();
        raza.borrarRazas(razas);
        
    }

}
