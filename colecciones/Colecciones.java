/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author elchi
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Iterator iter;
        
        LinkedList<String> lista = new LinkedList<String>();
        HashSet<String> conjunto = new HashSet<String>();
        TreeSet<String> arbol = new TreeSet<String>();
        
        for (i = 1; i <= 10; i++) {
            lista.add("Elemento "+i+" de la lista");
            conjunto.add("Elemento "+i+" del conjunto");
            arbol.add("Elemento "+i+" del arbol");
        }
        
        iter = lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
    
}
