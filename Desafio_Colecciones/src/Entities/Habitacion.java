/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entities;

//@author rembe

import java.util.Date;

 
public class Habitacion {
    
    private Integer habitacion;
    private Date fechaOcupacion;

    public Habitacion() {
    }

    public Habitacion(Integer habitacion, Date fechaOcupacion) {
        this.habitacion = habitacion;
        this.fechaOcupacion = fechaOcupacion;
    }

    public Integer getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Integer habitacion) {
        this.habitacion = habitacion;
    }

    public Date getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(Date fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }
    
    

}
