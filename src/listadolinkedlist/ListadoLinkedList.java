
package listadolinkedlist;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListadoLinkedList {

    public static void main(String[] args) {
        
        // Agregar al final de la lista
        /*List<Persona> lista = new LinkedList<Persona>();
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabriel", 30));// Creamos las personas y la guardamos en la lista
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "Todo Code", 2));
        
        // Agregar al principio de la lista
         lista.add(0, new Persona(5, "Probando", 98));
      
        System.out.println("---------FOR EACH---------");
        // recorrido for each
        
        for (Persona perso: lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }*/ 
        
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Luisina", 30));
        listaArray.add(new Persona(2, "Gabriel", 30));// Creamos las personas y la guardamos en la lista
        listaArray.add(new Persona(3, "Ibra", 9));
        listaArray.add(new Persona(4, "Todo Code", 2));
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Luisina", 30));
        listaLinked.add(new Persona(2, "Gabriel", 30));// Creamos las personas y la guardamos en la lista
        listaLinked.add(new Persona(3, "Ibra", 9));
        listaLinked.add(new Persona(4, "Todo Code", 2));
        
        // Remove en ArrayList
        listaArray.remove(1);
        
        // Remove en linkedlist
        String nombreBorrar = "Gabriel";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break;
            }
        }
        
        System.out.println("------LUEGO DE ELIMINAR------");
        System.out.println("------ARRAYLIST------");
        //Recorrido por Foreach
            for (Persona persona: listaArray) {
                System.out.println("Prueba:" + persona.getNombre());
            }
        System.out.println("------LINKEDLIST------");
         for (Persona persona : listaLinked) {
             System.out.println("Prueba:" + persona.getNombre());
         }
            
         // Tamaño lista
         System.out.println("------QUE TAMAÑO TIENEN LAS LISTAS------");
         System.out.println("ArrayList:" + listaArray.size());
         System.out.println("LinkedList:" + listaLinked.size());
         
         // Obtener primer objeto
         System.out.println("------PRIMER Y ULTIMO OBJETO (SOLO PARA LINKED LIST)------");
         
         System.out.println("Primero de LinkedList: " + listaLinked.getFirst());
         System.out.println("Ultimo de linkedList: " + listaLinked.getLast());
         
         //Borrar toda la lista
         System.out.println("------BORRANDO LISTAS------");
         listaArray.clear();
         listaLinked.clear();
         
         //Comprobar si esta vacia
         System.out.println("------ESTA VACIA UNA LISTA?------");
         System.out.println("ArrayList: " + listaArray.isEmpty());
         System.out.println("LinkedList: " + listaLinked.isEmpty());
    }

   
        
}
    

