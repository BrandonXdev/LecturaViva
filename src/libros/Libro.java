/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

import java.time.LocalDate;
import materialesBibliograficos.MaterialBibliografico;

/**
 *
 * @author Student
 */
public class Libro extends  MaterialBibliografico  {
    private int totalEejemplares;
    private String editorial;
    private int numeroPaginas;
    private boolean ejemplarDisponible;
    private int totalEjemeplaresDisponibles;

    public int getTotalEejemplares() {
        return totalEejemplares;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isEjemplaresDisponibles() {
        return ejemplarDisponible;
    }

    public int getTotalEjemeplaresDisponibles() {
        return totalEjemeplaresDisponibles;
    }

    public void setTotalEejemplares(int totalEejemplares) {
        this.totalEejemplares = totalEejemplares;
    }

    public void setTotalEjemeplaresDisponibles(int totalEjemeplaresDisponibles) {
        this.totalEjemeplaresDisponibles = totalEjemeplaresDisponibles;
    }

    public Libro(int totalEejemplares, String editorial, int numeroPaginas, boolean ejemplarDisponible, int totalEjemeplaresDisponibles, int codigo, String titulo, String autor, LocalDate añoPublicacion, String categoria, boolean disponible) {
        super(codigo, titulo, autor, añoPublicacion, categoria, disponible);
        this.totalEejemplares = totalEejemplares;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.ejemplarDisponible = ejemplarDisponible;
        this.totalEjemeplaresDisponibles = totalEjemeplaresDisponibles;
    }

    @Override
    public String toString() {
        return "Libro{" + "totalEejemplares = " + totalEejemplares + ", editorial = " + editorial + ", numeroPaginas = " + numeroPaginas + ", ejemplarDisponible = " + ejemplarDisponible + ", totalEjemeplaresDisponibles = " + totalEjemeplaresDisponibles + '}';
    }
    
}
