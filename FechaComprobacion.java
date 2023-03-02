/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuleta;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class FechaComprobacion {
    /*Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una fecha: (día / mes / año)");
        int dia, mes, ano;

        do {
            System.out.println("Introduce un día: ");
            dia = teclado.nextInt();

            System.out.println("Introduce un mes: ");
            mes = teclado.nextInt();

            System.out.println("Introduce un año: ");
            ano = teclado.nextInt();

        } while (!fechaCorrecta(dia, mes, ano));
        
        System.out.println("Fecha correcta.");
    }*/
    
    public static boolean fechaCorrecta(int d, int m, int a){// d, m y a, son variables independientes en este metodo en concreto.
        return mesCorrecto(m) && anoCorrecto(a) && diaCorrecto(d, m, a);
        //boolean por que te devuelve un true o false, si la fecha es o no correcta. Por eso se pone boolean.
    }

    public static boolean mesCorrecto(int mes) {//Cálculo del mes
        return mes >= 1 && mes <= 12;
    }
    
    public static boolean anoCorrecto(int ano) {//Cálculo del año
        return ano != 0;
    }

    public static boolean diaCorrecto(int dia, int mes, int ano) {//Cálculo del día
        return dia >= 1 && dia <= diasMes(mes, ano);
    }

    public static int diasMes(int mes, int ano) { 
        //int por que trabajas con enteros.
        //Calcula los dias que tiene un mes, dependiendo del mes en el que estemos.
        //Se pone int por que te devuelve un número entero.
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;// No pone break por que con el return hace que pare el metodo.
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (esBisiesto(ano)) {//Posteriormente se da valor a esBisiesto.
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;//Para que en cualquier otro número dentro de este swicth, el programa lo reconozca y devuelva 0.
        }
    }

    public static boolean esBisiesto(int ano) {//Para comprobar si el año es bisiesto.
        return (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
    }
}
