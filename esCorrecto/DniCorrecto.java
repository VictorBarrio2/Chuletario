/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuleta;

/**
 *
 * @author Alberto
 */
public class DniCorrecto {
    public static boolean correcto(String dni) {
        if (dni.length() == 9) {

            char letra = dni.charAt(8);
            String numeros;
            String cadenaRara = "TRWAGMYFPDXBNJZSQVHLCKE";
            int valorDni;

            numeros = dni.substring(0, 8);
            valorDni = Integer.valueOf(numeros) % 23;

            if (cadenaRara.charAt(valorDni) == letra) {
                return true;
            }            
        }
        return false;
    }
}
