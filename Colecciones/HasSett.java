/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;
import java.util.HashSet;
/**
 *
 * @author elchi
 */
public class HasSett {
    /*En Java, HashSetes una clase que se utiliza para almacenar una colección 
    de objetos sin duplicados, y sin un orden específico. Los elementos de un 
    HashSetpueden ser de cualquier tipo de objeto.*/
    
    public static void main(String[] args) {
        // Crear un HashSet de strings
        HashSet<String> nombres = new HashSet<>();

        // Añadir elementos al set
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("María"); // Este elemento no se añade debido a que ya existe

        // Imprimir la cantidad de elementos en el set
        System.out.println("El set tiene " + nombres.size() + " elementos");

        // Verificar si un elemento existe en el set
        System.out.println("El set contiene a Juan: " + nombres.contains("Juan"));
        System.out.println("El set contiene a Ana: " + nombres.contains("Ana"));

        // Remover un elemento del set
        nombres.remove("Pedro");

        // Imprimir los elementos restantes en el set
        System.out.println("Los elementos restantes en el set son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

