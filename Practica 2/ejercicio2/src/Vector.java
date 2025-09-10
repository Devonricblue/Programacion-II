/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Vector {
      private double x, y, z;

    
    public Vector(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

 
    public Vector suma(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    
    public Vector multiplicar(double r) {
        return new Vector(r * this.x, r * this.y, r * this.z);
    }

   
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    
    public Vector normalizar() {
        double m = this.magnitud();
        if (m == 0) return new Vector(0,0,0);
        return new Vector(x/m, y/m, z/m);
    }

    
    public double productoEscalar(Vector v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }

    
    public Vector productoVectorial(Vector v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new Vector(cx, cy, cz);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
