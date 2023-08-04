/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

//@author rembe
import java.util.HashMap;
import java.util.Scanner;

public class ServicePersona {

    private Scanner leer;
    private HashMap<Integer, String> persona;

    public ServicePersona() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.persona = new HashMap<>();
    }
    
    public void crearPersona(){
         
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.print("DNI: ");
        int dni = leer.nextInt();
        System.out.println("Nacionalidad: ");
        String pais = leer.next();
        
        persona.put(dni, nombre);
        System.out.println(nombre+" agregado correctamente");
    }
    
    public void agregarPersonas (int cantidad){
        for (int i = 0; i < cantidad; i++) {
            crearPersona();
        }
    }
    
    

}
