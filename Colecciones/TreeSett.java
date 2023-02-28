package Colecciones;

import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elchi
 */
public class TreeSett {

    /*En Java, TreeSetes una implementación de la interfaz Setque almacena los 
    elementos en un árbol de búsqueda binaria. Los elementos se ordenan 
    automáticamente en orden ascendente (por defecto) o descendente, según el 
    orden natural de los elementos o el comparador especificado.*/

    public static void main(String[] args) {
        // Crear un TreeSet de enteros
        TreeSet<Integer> numeros = new TreeSet<Integer>();

        // Añadir elementos al set
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);

        // Imprimir los elementos del set en orden ascendente
        System.out.println("Los elementos del set en orden ascendente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Crear un TreeSet de strings en orden descendente
        TreeSet<String> nombres = new TreeSet<String>((a, b) -> b.compareTo(a));

        // Añadir elementos al set
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");

        // Imprimir los elementos del set en orden descendente
        System.out.println("Los elementos del set en orden descendente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    /*
    RESULTADO
    Los elementos del set en orden ascendente:
    1
    2
    3
    4
    Los elementos del set en orden descendente:
    Pedro
    María
    Juan
    Ana
    */

}
