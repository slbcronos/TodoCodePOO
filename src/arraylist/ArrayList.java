/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

//import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;

/**
 *
 * @author slb_1
 */
public class ArrayList {
    public static void main(String[] args) {
        List<PersonaArrayList> lista = new java.util.ArrayList<PersonaArrayList>();
        
        lista.add(new PersonaArrayList(1,"Salvador",40));
        lista.add(new PersonaArrayList(2,"Aseneth",45));
        lista.add(new PersonaArrayList(3,"Carlos",30));
        lista.add(new PersonaArrayList(4,"Yolanda",31));
        
        //recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
            
        }
        System.out.println("---------------------------------------------------------------");
        
        //recorrer foreach
        for (PersonaArrayList perso : lista) {
            System.out.println("Prueba: " + perso.getNombre());
            
        }
        
        System.out.println("---------------------------------------------------------------");
        
        //remove en array
        lista.remove(3);
        
                //recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
            
        }
        System.out.println("---------------------------------------------------------------");
        
        
        
        
        
    }
    
}
