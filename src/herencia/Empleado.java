/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author slb_18
 */
public class Empleado extends Persona{
    int num_legal;
    String cargo;
    Double sueldo;
    
    public Empleado(){
        
    }

    public Empleado(int num_legal, String cargo, Double sueldo, int id, String ine, String nombre, String apellido, String domicilio, String telefono) {
        super(id, ine, nombre, apellido, domicilio, telefono);
        this.num_legal = num_legal;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legal() {
        return num_legal;
    }

    public void setNum_legal(int num_legal) {
        this.num_legal = num_legal;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
