/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
   private String identificacion;
   private String nombreCompleto;
   private LocalDate fechaNacimiento;
   private String telefono;
   private String correoElectronico;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public int getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    public Persona(String identificacion, String nombreCompleto, LocalDate fechaNacimiento, String telefono, String correoElectronico) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Identificacion: " + identificacion + "\n Nombre Completo: " + nombreCompleto + "\n Edad: " + getYears() + "\n Telefono: " + telefono + "\n Correo Electronico: " + correoElectronico;
    }
   
} 
