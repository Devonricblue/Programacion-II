/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author Pc
 */
public class Cabina {
    private int nroCabina;
    private ArrayList<Persona> personasaBordo;

    public Cabina(String codigo) {
        this.nroCabina = nroCabina;
        this.personasaBordo = new ArrayList<>();
    }

    public boolean agregar(Persona p) {
        if (personasaBordo.size() >= 10) return false;

        double pesoTotal = p.getPeso();
        for (Persona x : personasaBordo) pesoTotal += x.getPeso();
        if (pesoTotal > 850) return false;

        personasaBordo.add(p);
        return true;
    }

    public int getCantidadPersonas() {
        return personasaBordo.size();
    }

    public double calcularIngreso() {
        double total = 0;
        for (Persona p : personasaBordo) {
            if (p.esPreferencial()) total += 1.5;
            else total += 1.0;
        }
        return total;
    }
}
