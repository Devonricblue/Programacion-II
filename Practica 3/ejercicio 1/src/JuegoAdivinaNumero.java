/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import  java.util.Scanner;
/**
 *
 * @author Pc
 */
public class JuegoAdivinaNumero extends Juego{
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidasIniciales) {
        super(vidasIniciales);
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = (int) (Math.random() * 11);
        Scanner scanner = new Scanner(System.in);
        boolean acertado = false;

        while (!acertado) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int numero = scanner.nextInt();

            if (numero == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                acertado = true;
            } else {
                if (!quitaVida()) {
                    System.out.println("Game over. No te quedan más vidas.");
                    break;
                }
                System.out.println("El número a adivinar es " + 
                    (numero < numeroAAdivinar ? "mayor." : "menor."));
            }
        }
        scanner.close();
    }
}
