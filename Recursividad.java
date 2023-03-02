/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author elchi
 */
public class Recursividad {

/*La recursividad es un concepto importante en programación que se refiere
a la capacidad de una función para llamarse a sí misma. En otras palabras,
una función recursiva es aquella que se llama sí misma
dentro de su propia definición.*/
    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

/*En este ejemplo, la función factoriales una función recursiva que calcula 
el factorial de un número dado. Si el número es 1, la función devuelve 1. 
Si el número es mayor que 1, la función se llama a sí mismo con el número menos 
1, y el resultado se multiplica por el número original. Esta llamada recursiva 
se repite hasta que el número es 1, en cuyo caso la función devuelve 1.*/
