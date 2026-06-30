/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materialesBibliograficos;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public abstract class MaterialBibliografico {
    private int codigo;
    private String titulo;
    private String autor;
    private LocalDate anoPublicacion;
    private String categoria;
    private boolean disponible;
    
    public int getCodigo(){
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getAñoPublicacion() {
        return anoPublicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public MaterialBibliografico(int codigo, String titulo, String autor, LocalDate añoPublicacion, String categoria, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = añoPublicacion;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "MaterialBibliografico{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + ", categoria=" + categoria + ", disponible=" + disponible + '}';
    }
   
  
}
