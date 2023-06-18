/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author slb_1
 */
public class TryCatch {
    public static void main(String[] args) {
        
        try {
            int resultado = 3/0;
        } catch (Exception e) {
            System.out.println("No se ouede dividir por 0");
        }
        
    }
    
}
