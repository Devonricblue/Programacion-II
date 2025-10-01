/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class TrabajoPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado[] empleados = new Empleado[5];

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del empleado a tiempo completo " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el salario anual: ");
            double salarioAnual = sc.nextDouble();
            sc.nextLine(); 
            empleados[i] = new EmpleadoTiempCompleto(nombre, salarioAnual);
        }

        for (int i = 3; i < 5; i++) {
            System.out.println("Ingrese el nombre del empleado por horas " + (i - 2) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            double horas = sc.nextDouble();
            System.out.println("Ingrese la tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine(); 
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        System.out.println("\n Lista de empleados y sus salarios:");
        for (Empleado e : empleados) {
            System.out.println(e.toString());
        }

        sc.close();
    }
}

