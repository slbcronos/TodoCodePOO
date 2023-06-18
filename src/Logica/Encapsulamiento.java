/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author slb_18
 */
public class Encapsulamiento {
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5,"salvador", "lopez");
        
        System.out.println("El id del Alumno 2 es: "+alu2.getId());
        System.out.println("El Nombre del Alumno 2 es: "+alu2.getNombre());
        System.out.println("El Apellido del Alumno 2 es: "+alu2.getApellido());
        
    }
    
}
