/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author slb_18
 */
public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    
    public Alumno(){
        //constructor vacio
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    //metodos
    public void mostrarNombre()
    {
        System.out.println("Hola soy un alumno y se decir mi nombre");
    }
    

    
}
