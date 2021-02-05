package edu.escuelaing.arem.util;

/**
 * implementacion de nodos para linckedList
 * @param <E> tipo elemento contenido en el nodo
 */
public class Node<E> {

    private Node next = null;
    private E val;

    public Node(E e) {
        this.val = e;
    }

    /**
     * retorna el valor contenido en el nodo
     * @return
     */
    public E getVal() {
        return val;
    }

    /**
     *
     * @return el siguiente elemento anidado
     */
    public Node getNext() {
        return next;
    }

    /**
     * @return si tiene un elemeto siguienete
     */
    public boolean hasNext(){
        if (next != null){
            return true;
        }else {
            return false;
        }
    }

    /**
     * cambia el elemento siguiente
     * @param next elemento siguiente nuevo
     */
    public void setNext(Node next) {
        this.next = next;

    }
}
