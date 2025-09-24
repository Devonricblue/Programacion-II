/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Pc
 */
public class JuegoPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero();
        AdivinaPar juego2 = new AdivinaPar();
        AdivinaImpar juego3 = new AdivinaImpar();

        System.out.println("\n---- Juego Adivina Numero ----");
        juego1.juega();

        System.out.println("\n---- Juego Adivina Par ----");
        juego2.juega();

        System.out.println("\n---- Juego Adivina Impar ----");
        juego3.juega();
    }
    
}
