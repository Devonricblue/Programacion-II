/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author Pc
 */
public class MiTeleferico {
    private ArrayList<Linea> lineas;

    public MiTeleferico() {
        lineas = new ArrayList<>();
    }
    public void agregarLinea(Linea l) {
        lineas.add(l);
    }
    public double totalRecaudado() {
        double suma = 0;
        for (Linea l : lineas) suma += l.calcularRecaudacion();
        return suma;
    }

    
}
