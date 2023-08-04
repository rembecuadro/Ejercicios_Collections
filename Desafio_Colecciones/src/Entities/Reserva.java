/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entities;

//@author rembe

import java.util.Date;

 
public class Reserva {
    
    private int idReserva;
    private int cantidadPersonas;
    private Date fechaReserva;

    public Reserva() {
    }

    public Reserva(int idReserva, int cantidadPersonas, Date fechaReserva) {
        this.idReserva = idReserva;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaReserva = fechaReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

}
