/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Alberto
 */
public class TreeMapp {
    /*
    USO:
    El TreeMap es una clase en Java que implementa la interfaz SortedMap y 
    proporciona una forma de almacenar pares clave-valor en una colección, 
    donde los elementos se mantienen ordenados por su clave en orden ascendente.
    
    //UTILIDAD:
    El TreeMap es útil en situaciones donde se necesita mantener un orden 
    específico de los elementos en función de las claves, como en la 
    implementación de un *DICCIONARIO* o en la realización de búsquedas en grandes 
    conjuntos de datos. Sin embargo, debido a que utiliza un árbol balanceado 
    para almacenar los elementos, el TreeMap puede tener un rendimiento ligeramente 
    inferior en comparación con el HashMap en ciertas situaciones.
    
    //PARA AGREGAR CLAVES, VALOR, Y LA DECLARACION DEL TREEMAP:
    TreeMap<String, Integer> miTreeMap = new TreeMap<String, Integer>();
    miTreeMap.put("clave1", 1);
    miTreeMap.put("clave2", 2);
    miTreeMap.put("clave3", 3);
    
    //PARA RECUPERAR UN VALOR ASOCIADO A UNA CLAVE:
    Integer valor = miTreeMap.get("clave1");

    //PARA RECORRER TODOS LOS PARES DE CLAVE VALOR:
    for (Map.Entry<String, Integer> entrada : miTreeMap.entrySet()) {
        String clave = entrada.getKey();
        Integer valor = entrada.getValue();
        System.out.println(clave + ": " + valor);
    }

    
    */

}
