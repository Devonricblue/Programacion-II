/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Juego {
    protected int numeroDeVidas;
    private int record;
    private final int vidasIniciales;

    public Juego(int vidasIniciales) {
        this.vidasIniciales = vidasIniciales;
        this.numeroDeVidas = vidasIniciales;
        this.record = 0;
    }

    public void reiniciaPartida() {
        numeroDeVidas = vidasIniciales;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
        }
    }

    public boolean quitaVida() {
        if (numeroDeVidas > 0) {
            numeroDeVidas--;
        }
        return numeroDeVidas > 0;
    }
}
