/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;
import java.util.*;
/**
 *
 * @author elchi
 */
/*En Java, ArrayListes una clase que se utiliza para almacenar una colección
    de objetos en orden secuencial, añadir, remover y acceder a los elementos de 
    la lista por su índice. Los elementos de un ArrayListpueden ser de cualquier 
    tipo de objeto, incluyendo tipos de datos primitivos, como enteros y booleanos.*/
public class ArrayLista {

    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Añadir elementos a la lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acceder a elementos de la lista
        System.out.println("Elemento en índice 0: " + numeros.get(0));
        System.out.println("Elemento en índice 1: " + numeros.get(1));
        System.out.println("Elemento en índice 2: " + numeros.get(2));

        // Remover un elemento de la lista
        numeros.remove(1);

        // Iterar a través de la lista con un bucle for-each
        System.out.println("Elementos restantes en la lista:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
