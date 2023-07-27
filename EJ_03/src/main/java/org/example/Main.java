package org.example;

import org.example.Servicios.ServicioAlumno;

public class Main {
    public static void main(String[] args) {

        ServicioAlumno sa = new ServicioAlumno();
        sa.crearAlumno();
        sa.mostrarALumnos();
        //sa.notaFinal();
        System.out.println(sa.notaFinal());

    }
}