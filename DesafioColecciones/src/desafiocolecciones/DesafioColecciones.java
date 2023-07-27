/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiocolecciones;

import Entidades.Producto;
import Servicio.ServicioProducto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rembe
 */
public class DesafioColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Producto x;
       
       ServicioProducto sp = new ServicioProducto();
    
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Producto> listaProductos = new ArrayList();
        String opcion;
        do {   
            
         listaProductos.add(sp.crearProducto());
            System.out.println("Desea agregar otro producto: S/N?");
            opcion = scan.next();
            
        } while (opcion.equalsIgnoreCase("s"));
        
        System.out.println(listaProductos.toString());
        
  
    }
    
}
