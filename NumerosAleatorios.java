/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuletas;

/**
 *
 * @author alcap
 */
public class NumerosAleatorios {

    //Numero aleatorio entre 0 y un máximo sin incluir
    public static int generarNumeroAleatorio(int maximo) {
        return (int) (Math.random() * maximo);
    }

    //Numero aleatorio entre minimo y máximo
    public static int generarNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    }
}
