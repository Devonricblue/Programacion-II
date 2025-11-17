/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Aplicacion {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        MiTeleferico mt = new MiTeleferico();

        Linea roja = new Linea("Roja","Rojo"); 
        Cabina c1 = new Cabina("R1");
        Cabina c2 = new Cabina("R2");
        Cabina c3 = new Cabina("R3");

        
        roja.agregarCabina(c1);
        roja.agregarCabina(c2);
        roja.agregarCabina(c3);
        
        mt.agregarLinea(roja);
        
        c1.agregar(new Persona("Ana", 30, 60));
        c1.agregar(new Persona("jhon", 70, 70)); 
        c1.agregar(new Persona("Nina", 10, 40)); 

        roja.agregarCabina(c1);
        mt.agregarLinea(roja);

        System.out.println("Recaudacion total: " + mt.totalRecaudado());
        
    }
}


       


        


 
