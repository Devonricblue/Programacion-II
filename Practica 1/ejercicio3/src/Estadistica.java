/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Peredo Mamani Devon Richard
 */
public class Estadistica {
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    
    public static double desviacion(double[] numeros) {
        double prom = promedio(numeros);
        double sumaCuadrados = 0;
        
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - prom, 2);
        }
        
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Ingrese 10 números separados por espacios:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextDouble();
        }
        
        double prom = promedio(numeros);
        double dev = desviacion(numeros);
        
        System.out.printf("El promedio es %.2f%n", prom);
        System.out.printf("La desviación estándar es %.5f%n", dev);
        
        input.close();
    }
    
}
