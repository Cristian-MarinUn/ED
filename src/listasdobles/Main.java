
import listasdobles.DoubleList;
import listasdobles.DoubleNode;

public class Main {
    public static void main(String[] args) {
        DoubleList milista = new DoubleList();
         
        milista.addFirst("Cristian");
        milista.addFirst("Camilo");
        milista.addFirst("Luis");
        milista.addFirst("Carlos");
        milista.addFirst("Pedro");
        
        
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        
        
        milista.removeLast();
        
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        
        milista.addLast("Pablo Escobar");
        milista.addLast("Julio");
        
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        
        milista.removeFirst();
        milista.addFirst("pablito");
        
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        System.out.println("");
        
        milista.addBefore(milista.First(), "prueba");
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        
        
        milista.addAfter(milista.Last(), "prueba");
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        
        milista.buscarNodo("Luis");
    }
}
