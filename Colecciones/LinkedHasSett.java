/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.LinkedHashSet;

/**
 *
 * @author elchi
 */
public class LinkedHasSett {

    /*En Java, LinkedHashSetes una subclase de HashSetque mantiene el orden de 
    inserción de los elementos en la colección. Es decir, los elementos se 
    almacenan en el orden en que se agregan al LinkedHashSet. A diferencia del 
    HashSetnormal, el LinkedHashSetno almacena los elementos en un orden aleatorio.*/
        
    public static void main(String[] args) {
        // Crear un LinkedHashSet de strings
        LinkedHashSet<String> nombres = new LinkedHashSet<String>();

        // Añadir elementos al set
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");

        // Imprimir los elementos del set en el orden en que se agregaron
        System.out.println("Los elementos del set en el orden en que se agregaron:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Verificar si un elemento existe en el set
        System.out.println("El set contiene a Juan: " + nombres.contains("Juan"));
        System.out.println("El set contiene a José: " + nombres.contains("José"));

        // Remover un elemento del set
        nombres.remove("Pedro");

        // Imprimir los elementos restantes en el set en el orden en que se agregaron
        System.out.println("Los elementos restantes en el set en el orden en que se agregaron:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
