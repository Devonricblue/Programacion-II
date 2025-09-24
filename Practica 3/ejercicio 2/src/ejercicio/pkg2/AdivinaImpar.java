/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Pc
 */
public class AdivinaImpar extends JuegoAdivinaNumero{
     @Override
    public boolean validaNumero(int n) {
        if (n >= 0 && n <= 10 && n % 2 != 0) {
            return true;
        } else {
            System.out.println("Error: el numero no es impar o esta fuera de rango.");
            return false;
        }
    }
}
