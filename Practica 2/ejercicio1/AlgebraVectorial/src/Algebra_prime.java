/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Algebra_prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector a = new Vector(1, 0, 0);
        Vector b = new Vector(0, 1, 0);

        AlgebraVectorial av = new AlgebraVectorial();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a || b? (metodo producto punto): " + av.esPerpendicular(a, b, "punto"));

        System.out.println("a || b? " + av.esParalelo(a, b));

        System.out.println("ProyeccionA sobre b = " + av.proyeccion(a, b));

        
        System.out.println("ComponenteA en b = " + av.componente(a, b));
    }
}
    

