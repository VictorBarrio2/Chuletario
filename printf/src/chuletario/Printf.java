/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuletario;

/**
 *
 * @author elchi
 */
public class Printf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El printf es una función de salida en C y otros lenguajes de programación
        que permiten imprimir información en la consola o en un archivo de salida. 
        A continuación, te muestro algunos ejemplos básicos de cómo utilizar printfen C:*/

        //Imprimir una cadena de texto:
        System.out.printf("¡Hola, mundo!\n");

        //Imprimir un número entero:
        int num = 42;
        System.out.printf("El número es %d.\n", num);

        //Imprimir un número en coma flotante:
        float num2 = (float) 3.1415926;
        System.out.printf("El número es %f.\n", num2);

        //Imprimir un caracter:
        char letra = 'A';
        System.out.printf("El carácter es %c.\n", letra);

        //Imprimir una cadena de caracteres:
        String nombre = "Juan";
        System.out.printf("Mi nombre es %s.\n", nombre);

        //Especificar la longitud de los campos:
        int num3 = 42;
        System.out.printf("El número es %5d.\n", num3);

        //Imprimir varios valores a la vez:
        String nombre2 = "Juan";
        int edad = 25;
        System.out.printf("Mi nombre es %s y tengo %d años.\n\n\n", nombre2, edad);
        
        
        //Imprimir información con espacios en forma de tabla
        System.out.printf("| %-15s %-15s %-16s |\n", "Producto", "Cantidad", "Precio");
        System.out.printf("| %-15s %-15d $%-15.2f |\n", "Camisa", 2, 24.99);
        System.out.printf("| %-15s %-15d $%-15.2f |\n", "Pantalón", 1, 35.50);
        System.out.printf("| %-15s %-15d $%-15.2f |\n\n", "Calcetines", 3, 4.99);
        System.out.printf("| %-15s %-15s $%-15.2f |\n", "Total", "", 98.47);

    }

}
