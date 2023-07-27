/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections_ej4;

import Services.ServicePelicula;

/**
 *
 * @author rembe
 */
public class Collections_EJ4 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        ServicePelicula netflix = new ServicePelicula();
        
        netflix.ordenarPeliculasPor("TITULO", "ASC");
        netflix.ordenarPeliculasPor("TITULO", "DESC");
        netflix.ordenarPeliculasPor("DIRECTOR", "ASC");
        netflix.ordenarPeliculasPor("DIRECTOR", "DESC");
        netflix.ordenarPeliculasPor("DURACION", "ASC");
        netflix.ordenarPeliculasPor("DURACION", "DESC");
    }
    
}
