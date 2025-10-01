/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class EmpleadoTiempCompleto extends Empleado {
    private double salarioAnual;

    public EmpleadoTiempCompleto(String nombre, double salarioAnual) {
        super(nombre);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioAnual / 12;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [Nombre: " + nombre +
               ", Salario Anual: " + salarioAnual +
               ", Salario Mensual: " + calcularSalarioMensual() + "]";
    }
}