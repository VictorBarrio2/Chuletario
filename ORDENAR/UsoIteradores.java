/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoiteradores;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author alcap
 */
public class UsoIteradores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iterator iter;
        LinkedList<String> lista = new LinkedList<String>();
        /*HashSet<String> conjunto = new HashSet <String>();
        TreeSet <String> arbol = new TreeSet<String>();
        
        for (int i = 1; i <= 10; i++) {
            lista.add("Elemento "+i+" de la lista");
            conjunto.add("Elemento "+i+" de la lista");
            arbol.add("Elemento "+i+" de la lista");
        }
        
        iter = lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        
        iter = conjunto.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        
        iter = arbol.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());*/
        
        //ORDENAR     
        lista.add("Juan");
        lista.add("Ana");
        lista.add("Teresa");
        lista.add("Antonio");
        
        iter = lista.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        
        System.out.println("\nY ahora ordenados...");
        Collections.sort(lista);
        
        iter = lista.iterator();//Para poder recorrer la lista
        while(iter.hasNext())//Recorre la lista si hay siguiente en ella
            System.out.println(iter.next());//Muestra de la lista lo que haya en la siguiente posicion
        
        //ORDENAR POR ESPECIFICACIONES DE OBJETOS
        //implementar con implements Comparable en la clase y utilizar el siguiente metodo (ejemplo se hace con clase persona):
        /*public int compareTo(Object o) {
            String nomCompleto = apellidos+" "nombre;
            Persona p = (Persona) o;
            return nomCompleto.compareToIgnoreCase(p.getApellidos()+" "+p.getNombre());
        }*/
    }
    
}
