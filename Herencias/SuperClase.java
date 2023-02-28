/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias;

/**
 *
 * @author elchi
 */
public class SuperClase {

    /*En Java, la herencia se refiere al concepto de que una clase puede heredar 
    propiedades y comportamientos de otra clase. La clase que hereda se llama subclase 
    o clase derivada, mientras que la clase de la cual hereda se llama 
    superclase o clase base.*/
    
    //Para heredar de una clase en Java, se utiliza la palabra clave extendsseguida del nombre de la clase base.
    class SubClase extends SuperClase {
        // Código de la subclase
    }

    /*La subclase hereda todos los campos y métodos no privados de la superclase. 
    La subclase puede entonces agregar nuevos campos y métodos, o sobrescribir 
    los métodos existentes de la superclase.*/
    class Vehiculo {

        //PARA HEREDAR VARIABLES LAS CREAMOS COMO PROTECTED
        protected String marca;
        protected String modelo;
        protected int anio;

        public Vehiculo(String marca, String modelo, int anio) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }
        
        void acelerar() {
            System.out.println("El vehículo está acelerando");
        }
    }
    
    //Hereda de vehiculo
    class Coche extends Vehiculo {//PARA HEREDAR PONEMOS EXTENDS VEHICULO

        int numPuertas;

        public Coche(String marca, String modelo, int anio) {
            super(marca, modelo, anio);//CONSTRUCTOR DE VEHICULO
        }

        void aparcar() {
            System.out.println("El coche está aparcando");
        }
    }
    
    //Hereda de vehiculo
    class Motocicleta extends Vehiculo {//PARA HEREDAR PONEMOS EXTENDS VEHICULO

        int cilindrada;

        public Motocicleta(String marca, String modelo, int anio) {
            super(marca, modelo, anio);//CONSTRUCTOR DE VEHICULO
        }

        void derrapar() {
            System.out.println("La motocicleta está derrapando");
        }
    }
}
