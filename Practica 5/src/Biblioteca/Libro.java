/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
import java.util.*;
/**
 *
 * @author Pc
 */
public class Libro {
    private String titulo;
    private String isbn;
    private ArrayList<Pagina> paginas; 
    private boolean prestado;

    public Libro(String titulo, String isbn, int numPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        this.prestado = false;

        for (int i = 1; i <= numPaginas; i++) {
            paginas.add(new Pagina(i, "Contenido de la pagina " + i));
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean estado) {
        this.prestado = estado;
    }

    public void leer() {
        System.out.println("Leyendo \"" + titulo + "\":");
        for (Pagina p : paginas) {
            p.mostrarContenido();
        }
    }

    private class Pagina {
        private int numero;
        private String contenido;

        public Pagina(int numero, String contenido) {
            this.numero = numero;
            this.contenido = contenido;
        }

        public void mostrarContenido() {
            System.out.println("Pagina " + numero + ": " + contenido);
        }
    }
}



