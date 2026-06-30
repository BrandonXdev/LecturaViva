/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamos;

import materialesBibliograficos.MaterialBibliografico;
import java.time.LocalDate;


public class Prestamo {
    private Usuario usuario;
    private MaterialBibliografico materiales;
    private LocalDate fechaPrestamo;
    private LocalDate fechaMaximaDevolucion;
    private LocalDate fechaDevolucion;

    public Usuario getUsuario() {
        return usuario;
    }

    public MaterialBibliografico getMateriales() {
        return materiales;
    }

    public localDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public localDate getFechaMaximaDevolucion() {
        return fechaMaximaDevolucion;
    }

    public localDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Prestamo(Usuario usuario, MaterialBibliografico materiales, LocalDate fechaPrestamo, LocalDate fechaMaximaDevolucion, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.materiales = materiales;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    
    
    
    
    
}
