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
public class Biblioteca {
    private String nombreBiblioteca;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Autor> listaAutores;
    private ArrayList<Prestamo> prestamosActivos;
    private Horario horario; 

    public Biblioteca(String nombre, String dias, String horaInicio, String horaFin) {
        this.nombreBiblioteca = nombre;
        this.listaLibros = new ArrayList<>();
        this.listaAutores = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.horario = new Horario(dias, horaInicio, horaFin);
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void agregarAutor(Autor autor) {
        listaAutores.add(autor);
        System.out.println(" Autor registrado: " + autor.getNombre());
    }

    
    public void prestarLibro(Estudiante estudiante, Libro libro) {
        if (!libro.isPrestado()) {
            Prestamo nuevo = new Prestamo(estudiante, libro);
            prestamosActivos.add(nuevo);
            libro.setPrestado(true);
            System.out.println("Libro prestado: " + libro.getTitulo() + " a " + estudiante.getNombre());
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" ya esta prestado.");
        }
    }

    public void mostrarEstado() {
        System.out.println("ESTADO DE LA BIBLIOTECA: " + nombreBiblioteca + "-");
        horario.mostrarHorario();

        System.out.println("LIBROS DISPONIBLES:");
        for (Libro l : listaLibros) {
            if (!l.isPrestado()) {
                System.out.println(" - " + l.getTitulo() + " (ISBN: " + l.getIsbn() + ")");
            }
        }

        System.out.println("AUTORES REGISTRADOS:");
        for (Autor a : listaAutores) {
            a.mostrarInfo();
        }

        System.out.println("PRESTAMOS ACTIVOS:");
        if (prestamosActivos.isEmpty()) {
            System.out.println("No hay prestamos en curso.");
        } else {
            for (Prestamo p : prestamosActivos) {
                p.mostrarInfo();
                System.out.println("~~~~~~~~~~~~~");
            }
        }
    }

    public void cerrarBiblioteca() {
        System.out.println("La biblioteca " + nombreBiblioteca + " ha cerrado. Todos los prestamos quedan anulados.");
        prestamosActivos.clear();
    }

    private class Horario {
        private String diasApertura;
        private String horaApertura;
        private String horaCierre;

        public Horario(String dias, String apertura, String cierre) {
            this.diasApertura = dias;
            this.horaApertura = apertura;
            this.horaCierre = cierre;
        }

        public void mostrarHorario() {
            System.out.println("Horario: " + diasApertura + " de " + horaApertura + " a " + horaCierre);
        }
    }
}


