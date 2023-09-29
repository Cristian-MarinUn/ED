package listasdobles;

// @author crisc
public class operaciones {
   
    
    public void insertarOrdenado(DoubleList n, Object e){
        
        
        if (n.isEmpty()){
            n.addFirst(e);
        } else{
            DoubleNode temp = n.First();
            while (temp != null && e > temp.getData()){
                temp = temp.getNext();
                
                if ( temp == null){
                    n.addLast(e);
                } else{
                    n.addBefore(temp, e);
                }
                
            }
        }
        
    }
    
    
    
    
    

    
    
    
    
    
    
    
}
