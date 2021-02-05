package edu.escuelaing.arem.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * implementacion de un lista enlazada.
 * @param <E> el tipo de elementos contenidos en la lista
 */
public class LinkedList<E> implements List<E> {

    private Node<E> first = null;
    private Node<E> last = null;
    int size = 0;
    private IteratorLinked iteratorLinked = new IteratorLinked(this);

    /**
     * @return el ultimo elemento de la lista
     */
    public Node<E> getLast() {
        return last;
    }

    /**
     * @return el primer elemento de la lista
     */
    public Node<E> getFirst() {
        return first;
    }

    /**
     * @return el tamaño de la lista (numero de elementos)
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * @return si esta vacia la lista
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    /**
     * @return el iterador para esta lista
     */
    @Override
    public Iterator<E> iterator() {
        return iteratorLinked;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * funcion para añadir elemetos a la lista
     * @param e elemento para añadir
     * @return boleano que confirma que se añadio
     */
    @Override
    public boolean add(E e) {
        Node nuevo = new Node(e);
        if(first == null){
            first = nuevo;
            last = nuevo;
            iteratorLinked.setActual(nuevo);
        }else {
            last.setNext(nuevo);
            last = nuevo;
        }
        this.size += 1;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    /**
     * remueve todos los elementos
     * @param c
     * @return
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        first = null;
        last = null;
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
