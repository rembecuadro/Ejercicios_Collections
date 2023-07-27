/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

//@author rembe
import Entidades.Raza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioRaza {

    Scanner leer = new Scanner(System.in);

    public ArrayList<String> crearRaza() {
        
       ArrayList<String> razas = new ArrayList();
       String raza;

        while (true) {

            System.out.println("Ingrese raza :(o escriba 'salir'.)");
            raza = leer.nextLine();
            
            if (raza.equalsIgnoreCase("salir")) {
                break;
            }
            razas.add(raza);
        }
        System.out.println("Las razas ingresadas son: " + razas);
        return razas;
    }

    public void borrarRazas(ArrayList razas) {

        System.out.println("Cual es la raza que desea eliminar?");
        String raza = leer.nextLine();
        boolean existe = false;
        Iterator<String> iterator = razas.iterator();

        while (iterator.hasNext()) {
            String aux = iterator.next();
            if (aux.equals(raza)) {
                iterator.remove();
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("La raza " + raza + " no existe en la lista razas");
        }
        Collections.sort(razas);
        System.out.println(razas);
    }
}
