
import listasdobles.DoubleList;
import listasdobles.DoubleNode;

public class Main {
    public static void main(String[] args) {
        DoubleList milista = new DoubleList();
         
        milista.addFirst(1);
        milista.addFirst(2);
        milista.addFirst(3);
        milista.addFirst(4);
        milista.addFirst(5);
        
        
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        
        
        
        
        
        milista.mostrarLista();
        System.out.println(" ");
        System.out.println(milista.size());
        
        
        
    }
}
