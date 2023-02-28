/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_Abstractos;

/**
 *
 * @author elchi
 */
public class Abstarctos {

    /*En Java, un método abstracto es un método que no tiene implementación en 
    la clase abstracta, sino que debe ser implementado por cualquier subclase
    que herede de ella. Los métodos abstractos se declaran con la
    palabra clave abstract.*/
    
    //UNA CLASE ABSTRACTA NO SE PUEDE CREAR COMO OBJETO EN EL MAIN
    
    public abstract class Figura { //DECLARAMOS LA CLASE COMO ABSTRACTA

        protected String nombre;

        public Figura(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public abstract double area(); //CREAMOS UN METODO ABSTRACTO
    }

    public class Rectangulo extends Figura {//HEREDA DE FIGURA COMO CLASE PADRE

        private double base;
        private double altura;

        public Rectangulo(String nombre, double base, double altura) {
            super(nombre);
            this.base = base;
            this.altura = altura;
        }
        
        @Override              //LLAMAMOS AL METODO ABSTRACTO Y LO HACEMOS UTIL
        public double area() {
            return base * altura;
        }
    }

    public class Circulo extends Figura {//HEREDA DE FIGURA COMO CLASE PADRE

        private double radio;

        public Circulo(String nombre, double radio) {
            super(nombre);
            this.radio = radio;
        }
        
        @Override              //LLAMAMOS AL METODO ABSTRACTO Y LO HACEMOS UTIL
        public double area() { 
            return Math.PI * Math.pow(radio, 2);
        }
    }

}
