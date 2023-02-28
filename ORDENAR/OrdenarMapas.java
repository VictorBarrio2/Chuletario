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
public class OrdenarMapas {
    /*LOS MAPAS NO SE PUEDEN ORDENAR DIRECTAMENTE PERO SI SE PUEDE POR SUS VALORES
    
    Se ha convertido el mapa a una lista de pares de clave-valor utilizando el método entrySet, 
    y luego se ha ordenado la lista por los valores utilizando un comparador que se crea utilizando el método comparing de la clase Comparator
    
    Map<String, Integer> map = new HashMap<>();
    map.put("cinco", 5);
    map.put("dos", 2);
    map.put("diez", 10);
    map.put("uno", 1);
    map.put("ocho", 8);

    List<Map.Entry<String, Integer>> lista = new ArrayList<>(map.entrySet());
    Collections.sort(lista, Comparator.comparing(Map.Entry::getValue));
    System.out.println(lista);
    */
}
