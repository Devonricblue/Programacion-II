/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author Pc       
 */
public class Linea {
    private String nombre;
    public String color;
    private final int LIMITE_CABINAS = 20;
    private ArrayList<Cabina> cabinas;

    public Linea(String nombre,String color) {
        this.nombre = nombre;
        this.color = color;
        this.cabinas = new ArrayList<>();
    }

    public boolean agregarCabina(Cabina c) {
        if (cabinas.size() >= LIMITE_CABINAS) {
        return false;
    }
        cabinas.add(c);
        return true;
    }

    public double calcularRecaudacion() {
        double suma = 0;
        for (Cabina c : cabinas) {
            suma += c.calcularIngreso();
        }
        return suma;
    }
}
