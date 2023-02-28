/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author elchi
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        LinkedList<String> lista = new LinkedList<String>();
        Iterator iter;
        
        lista.add("Juan");
        lista.add("Ana");
        lista.add("Teresa");
        lista.add("Antonio");
        
        iter = lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        
        System.out.println("\nY ahora ordenados....");
        Collections.sort(lista);
        
        iter = lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
            */
        LinkedList<Persona> lista = new LinkedList<Persona>();
        Iterator iter;
        
        lista.add(new Persona("Victor", "Barrio"));
        lista.add(new Persona("Alberto", "Guillen"));
        lista.add(new Persona("Ivan", "Fernandez"));
        
        iter = lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        
        System.out.println("\nY ahora ordenados....");
        Collections.sort(lista);
        
        iter = lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        
    }
    
}
