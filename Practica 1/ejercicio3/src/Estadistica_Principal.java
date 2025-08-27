/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Peredo Mamani Devon Richard
 */
public class Estadistica_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Ingrese 10 numeros separados por espacios:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextDouble();
        }
        
        Estadisticas stats = new Estadisticas(numeros);
        
        double prom = stats.getPromedio();
        double dev = stats.getDesviacion();
        
        System.out.printf("El promedio es %.2f%n", prom);
        System.out.printf("La desviacion estandar es %.5f%n", dev);
        
        input.close();
    }
}
    
