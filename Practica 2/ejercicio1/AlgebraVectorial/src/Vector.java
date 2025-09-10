/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Vector {
     private double x;
    private double y;
    private double z;

    
    public Vector() {
        this(0, 0, 0);
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

     
    public double productoPunto(Vector b) {
        return this.x*b.x + this.y*b.y + this.z*b.z;
    }

     
    public Vector productoCruz(Vector b) {
        return new Vector(
            this.y*b.z - this.z*b.y,
            this.z*b.x - this.x*b.z,
            this.x*b.y - this.y*b.x
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
