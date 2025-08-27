/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class EcuacionLineal_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Pedir valores al usuario
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        // Crear objeto
        EcuacionLineal eq = new EcuacionLineal(a, b, c, d, e, f);

        // Mostrar resultados
        if (eq.tieneSolucion()) {
            System.out.println("x = " + eq.getX() + ", y = " + eq.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion.");
        }

        sc.close();
    }
}
    

