package Lab12;

import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {

    public void enqueue(E element) {
        addLast(element);
    }

    public E dequeue() {
        return removeFirst();
    }

    public E peek() {
        return getFirst();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    }

