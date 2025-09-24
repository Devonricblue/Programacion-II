/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class JuegoAdivinaNumero {
    public boolean validaNumero(int n) {
        return (n >= 0 && n <= 10);
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 0 y 10: ");
        int num = sc.nextInt();

        if (validaNumero(num)) {
            System.out.println("Numero valido: " + num);
        } else {
            System.out.println("Numero invalido, fuera de rango.");
        }
    }
}
