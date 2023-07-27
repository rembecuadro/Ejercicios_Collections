/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Servicio;

//@author rembe

import Entidades.Producto;
import java.util.Scanner;

 
public class ServicioProducto {
    
    public static Producto crearProducto(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de producto a crear:");
        String nombre = scan.next();
        System.out.println("Ingrese categoria:");
        String categoria = scan.next();
        System.out.println("Ingrese precio:");
        int precio = scan.nextInt();
        System.out.println("Ingrese stock inicial:");
        int stock = scan.nextInt();
        return new Producto(nombre,categoria,precio,stock);
    }

}
