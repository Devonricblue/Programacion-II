/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author Pc
 */
public class FigurasPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Figura[] figuras = new Figura[5];
        
        for (int i = 0; i < 5; i++) {
            int tipo = rand.nextInt(2) + 1;
            if (tipo == 1) {
                double lado = rand.nextDouble() * 10 + 1;
                figuras[i] = new Cuadrado("Rojo", lado);
            } else {
                double radio = rand.nextDouble() * 10 + 1;
                figuras[i] = new Circulo("Azul", radio);
            }
        }
        
        for (Figura figura : figuras) {
            System.out.println("Tipo: " + figura.getClass().getSimpleName());
            System.out.println("Area: " + String.format("%.2f", figura.area()));
            System.out.println("Perimetro: " + String.format("%.2f", figura.perimetro()));
            
            if (figura instanceof Coloreado) {
                Coloreado coloreable = (Coloreado) figura;
                System.out.println("Coloreado: " + coloreable.comoColorear());
            }
            System.out.println("__________________");
        }
    }
    
}
