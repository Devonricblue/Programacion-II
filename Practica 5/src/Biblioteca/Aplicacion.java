/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Biblioteca;
import java.util.*;
/**
 *
 * @author Pc
 */
public class Aplicacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Biblioteca UMSA", "Lunes a Viernes", "08:00", "18:00");
        Autor autor1 = new Autor("Amaru Quispe Choque", "Bolivia");
        Autor autor2 = new Autor("Lucia Andrade Flores", "Chile");
        biblio.agregarAutor(autor1);
        biblio.agregarAutor(autor2);
        Libro libro1 = new Libro("El eco de las montanas", "978-1-2345-6789-0", 3);
        Libro libro2 = new Libro("Sombras del altiplano", "978-1-2345-6791-3", 2);
        Libro libro3 = new Libro("Cumbre del cielo", "978-1-2345-6792-0",5);
        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);
        biblio.agregarLibro(libro3);
        Estudiante estudiante1 = new Estudiante("E2025", "Devon Peredo");
        Estudiante estudiante2 = new Estudiante("E2026", "Alejandra Lopez");
        biblio.prestarLibro(estudiante1, libro1);
        biblio.prestarLibro(estudiante2, libro1); 
        biblio.prestarLibro(estudiante2, libro2);
        biblio.mostrarEstado();
        libro2.leer(); 
        biblio.cerrarBiblioteca();
    }
}