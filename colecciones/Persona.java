/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author elchi
 */
public class Persona implements Comparable{

    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

  
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    @Override
    public int compareTo(Object t) {
        String nomCompleto= apellidos +"  "+nombre;
        Persona p = (Persona) t;
        return nomCompleto.compareTo(p.getApellidos()+" "+p.getNombre());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}
