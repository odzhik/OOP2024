package Lab5;

import Lab5.Animal;
import Lab5.AnimalArrayList;

public class AnimalLinkedList {
    public Node header;
    public int size;

    public class Node {
        private Animal element;
        Node prev;
        Node next;

        Node(Animal element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public Animal getElement() {
            return element;
        }
    }

    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.prev = header;
        header.next = header;
        size = 0;
    }

    public void add(Animal animal, Node node) {
        Node newNode = new Node(animal, node, node.next);
        node.next.prev = newNode;
        node.next = newNode;
        size++;
    }

    public void add(Animal animal) {
        add(animal, header);
    }

    public void addAll(AnimalArrayList arrayList) {
        for (Animal animal : arrayList) {
            add(animal, header);
        }
    }

    public Node findNodeByIndex(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        Node current = header.next;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node current = header.next;
        while (current != header) {
            System.out.println(current.getElement().getName());
            current = current.next;
        }
    }

    public  void isEmpty() {
        if (size == 0) {
            System.out.println("List is empty");
        }
    }
}


