package listasdobles;

// @author crisc
public class DoubleList<t> {

    private DoubleNode<t> head;
    private DoubleNode<t> tail;
    private int size;

    public DoubleList() {
        head = null;
        tail = null;
        size = 0;

    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public DoubleNode<t> First() {
        return head;
    }

    public DoubleNode<t> Last() {
        return tail;
    }

    public void addFirst(Object e) {
        DoubleNode<t> n = new DoubleNode(e);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            n.setNext(head);
            head.setPrev(n);
            head = n;

        }
        size++;
    }

    public void addLast(Object e) {
        DoubleNode<t> n = new DoubleNode(e);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            tail.setNext(n);
            n.setPrev(tail);
            tail = n;

        }
        size++;
    }

    public Object removeFirst() {

        if (!isEmpty()) {
            DoubleNode<t> temp = head;
            head = temp.getNext();

            temp.setNext(null);
            temp.setPrev(null);
            size--;
            return temp.getData();
        } else {
            return null;

        }

    }

    public Object removeLast() {

        if (isEmpty()) {
            return null;
        } else {
            DoubleNode<t> temp = tail;
            tail = temp.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
            size--;
            return temp.getData();
        }

    }

    public Object remove(DoubleNode<t> n) {
        if (n == head) {
            return removeFirst();
        } else if (n == tail) {
            return removeLast();
        } else {

            //variable temporal para almacenar el nodo a quitar
            Object e = n.getData();
            //variales temporales para separar el nodo
            DoubleNode<t> temp_prev = n.getPrev();
            DoubleNode<t> temp_next = n.getNext();

            temp_prev.setNext(temp_next);
            temp_next.setPrev(temp_prev);
            //desconcexión
            n.setNext(null);
            n.setPrev(null);
            size--;
            return e;

        }

    }

    public void addBefore(DoubleNode<t> n, Object e) {
        
        if (n == head) {
            addFirst(e);
        } else {
            DoubleNode<t> m = new DoubleNode(n);
            DoubleNode<t> temp_prev = n.getPrev();
            //conexciones al nuevo nodo
            m.setPrev(temp_prev);
            m.setNext(n);
            m.setPrev(m);
            size++;
        }

    }

    public void addAfter(DoubleNode<t> n, Object e) {
        if (n == tail) {
            addLast(e);
        } else {
            DoubleNode<t> m = new DoubleNode(e);
            DoubleNode<t> temp_next = n.getNext();
            //conexciones
            m.setNext(temp_next);
            m.setNext(m);
            m.setPrev(n);
            temp_next.setPrev(m);
            size++;
        }

    }

    public void mostrarLista() {

        DoubleNode<t> aux = head;
        while (aux != null) {

            System.out.print("[" + aux.getData() + "]" + "->");
            aux = aux.getNext();

        }

    }

    public void buscarNodo(Object e) {
        DoubleNode<t> aux = head;
        
        while (aux != null){
            if ( aux.getData() == e){
                System.out.println("nodo "+aux.getData()+" Existe");
            }
            aux=aux.getNext();
        }
    }

}
