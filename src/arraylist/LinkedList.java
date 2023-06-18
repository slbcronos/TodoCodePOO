/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

//import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author slb_18
 */
public class LinkedList {
        public static void main(String[] args) {
        List<PersonaArrayList> lista = new java.util.LinkedList <PersonaArrayList>();
        
        lista.add(new PersonaArrayList(1,"Salvador",40));
        lista.add(new PersonaArrayList(2,"Aseneth",45));
        lista.add(new PersonaArrayList(3,"Carlos",30));
        lista.add(new PersonaArrayList(4,"Yolanda",31));
        
        //agregar al principio
        lista.add(0,new PersonaArrayList(1,"Pepe el Toro",40));
        
        //recorrer foreach
        for (PersonaArrayList perso : lista) {
            System.out.println("Prueba: " + perso.getNombre());
            
        }
        
        System.out.println("---------------------------------------------------------------");
        
        String nombreBorrar = "Yolanda";
            for (PersonaArrayList personaArrayList : lista) {
                if (personaArrayList.getNombre().equals(nombreBorrar)) {
                    lista.remove(personaArrayList);
                    break; // para que se pueda volver a recorrer
                    
                }
                
            }
            
                    //recorrer foreach
        for (PersonaArrayList perso : lista) {
            System.out.println("Prueba: " + perso.getNombre());
            
        }
                
                
        
        
        
        
        
    }
    
}
