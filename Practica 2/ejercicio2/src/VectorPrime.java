/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class VectorPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(4, 5, 6);

        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);

        System.out.println("suma: a + b = " + a.suma(b));
        System.out.println("escalar: 2 * a = " + a.multiplicar(2));
        System.out.println("magnitud: |a| = " + a.magnitud());
        System.out.println("Normal de a = " + a.normalizar());
        System.out.println("Producto escalar: a . b = " + a.productoEscalar(b));
        System.out.println("Producto vectorial: a x  b = " + a.productoVectorial(b));
    }
}
   