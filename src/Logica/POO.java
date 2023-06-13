/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

/**
 *
 * @author slb_18
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5,"salvador", "lopez");
        
        System.out.println("El id del Alumno 2 es: "+alu2.getId());
        System.out.println("El Nombre del Alumno 2 es: "+alu2.getNombre());
        System.out.println("El Apellido del Alumno 2 es: "+alu2.getApellido());
        
        System.out.println("---------------------------------------");
        alu1.setId(8);
        alu1.setNombre("Aseneth");
        alu1.setApellido("Zaragoza");
        
        System.out.println("El id del Alumno 1 es: "+alu1.getId());
        System.out.println("El Nombre del Alumno 1 es: "+alu1.getNombre());
        System.out.println("El Apellido del Alumno 1 es: "+alu1.getApellido());
        
        System.out.println("---------------------------------------");
        
        alu1.setId(1000); // cambio de valor con SET
        System.out.println("El id del Alumno 1 es: "+alu1.getId());
        System.out.println("El Nombre del Alumno 1 es: "+alu1.getNombre());
        System.out.println("El Apellido del Alumno 1 es: "+alu1.getApellido());
    }
    
}
