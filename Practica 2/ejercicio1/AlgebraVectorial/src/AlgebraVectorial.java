/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class AlgebraVectorial {
      public boolean esPerpendicular(Vector a, Vector b) {
        double normaSuma = new Vector(a.getX()+b.getX(), a.getY()+b.getY(), a.getZ()+b.getZ()).magnitud();
        double normaResta = new Vector(a.getX()-b.getX(), a.getY()-b.getY(), a.getZ()-b.getZ()).magnitud();
        return Math.abs(normaSuma - normaResta) < 1e-9; // tolerancia
    }

    public boolean esPerpendicular(Vector a, Vector b, String metodo) {
        return Math.abs(a.productoPunto(b)) < 1e-9;
    }

    public boolean esParalelo(Vector a, Vector b) {
        Vector cruz = a.productoCruz(b);
        return Math.abs(cruz.getX()) < 1e-9 && Math.abs(cruz.getY()) < 1e-9 && Math.abs(cruz.getZ()) < 1e-9;
    }
    public Vector proyeccion(Vector a, Vector b) {
        double escalar = a.productoPunto(b) / Math.pow(b.magnitud(), 2);
        return new Vector(escalar * b.getX(), escalar * b.getY(), escalar * b.getZ());
    }
 
    public double componente(Vector a, Vector b) {
        return a.productoPunto(b) / b.magnitud();
    }
}
