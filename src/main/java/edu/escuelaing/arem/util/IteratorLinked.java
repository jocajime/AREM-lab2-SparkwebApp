package edu.escuelaing.arem.util;

import java.util.Iterator;

/**
 * Implementacion de un iterador para LinckedList
 * @param <E> el tipo de elementos contenidos en el iterador
 */
public class IteratorLinked<E> implements Iterator<E> {

    private LinkedList<E> lista = null;
    private Node<E> actual = null;


    /**
     * construtor
     * @param lista
     */
    public IteratorLinked(LinkedList<E> lista){
        this.lista = lista;
        this.actual = lista.getFirst();
    }

    /**
     * cambiar el nodo de iteracion actual
     * @param actual
     */
    public void setActual(Node actual) {
        this.actual = actual;
    }

    /**
     * retorna si hay un elemento siguiente
     * @return
     */
    @Override
    public boolean hasNext() {
        if (actual == null){
            actual= lista.getFirst();
            return false;
        }else {
            return true;
        }
    }

    /**
     * el elemento siguiente al actual
     * @return
     */
    @Override
    public E next() {
        E resultado = actual.getVal();
        actual = actual.getNext();
        return resultado;
    }

}
