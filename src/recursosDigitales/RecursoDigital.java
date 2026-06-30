/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursosDigitales;

import java.time.LocalDate;
import materialesBibliograficos.MaterialBibliografico;

/**
 *
 * @author Student
 */
public class RecursoDigital extends MaterialBibliografico  {
    private String formatoArchivo;
    private int tamanoMB;
    private boolean enlaceAccesoDisponible;
  

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public int getTamanoMB() {
        return tamanoMB;
    }
  
    public boolean isEnlaceAcceso() {
        return enlaceAccesoDisponible;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public void setTamano(int tamano) {
        this.tamanoMB = tamano;
    }

    public void setEnlaceAcceso(boolean enlaceAcceso) {
        this.enlaceAccesoDisponible = enlaceAcceso;
    }

    public RecursoDigital(String formatoArchivo, int tamano, boolean enlaceAcceso, int codigo, String titulo, String autor, LocalDate añoPublicacion, String categoria, boolean disponible) {
        super(codigo, titulo, autor, añoPublicacion, categoria, disponible);
        this.formatoArchivo = formatoArchivo;
        this.tamanoMB = tamano;
        this.enlaceAccesoDisponible = enlaceAcceso;
    }

    @Override
    public String toString() {
       
        return "RecursoDigital{" + "formatoArchivo = " + formatoArchivo + ", tamanoMB = " + tamanoMB + ", enlaceAcceso = " + enlaceAccesoDisponible + '}';
    }
    
    
}
