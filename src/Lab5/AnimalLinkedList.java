package Lab5;

import Lab5.Animal;
import Lab5.AnimalArrayList;

public class AnimalLinkedList {
    public Node header;  // Ссылка на первый (фиктивный) узел
    private int size;     // Размер списка

    // Приватный внутренний класс Node
    public class Node {
        private Animal element;
        Node prev;
        Node next;

        Node(Animal element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        // Public getter for element
        public Animal getElement() {
            return element;
        }
    }

    // Дефолтный пустой конструктор
    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.prev = header;
        header.next = header;
        size = 0;
    }

    // Метод для добавления нового элемента после указанного узла
    public void add(Animal animal, Node node) {
        Node newNode = new Node(animal, node, node.next);
        node.next.prev = newNode;
        node.next = newNode;
        size++;
    }

    // Публичный метод для добавления нового элемента после header
    public void add(Animal animal) {
        add(animal, header);
    }

    // Метод для добавления всех элементов из AnimalArrayList
    public void addAll(AnimalArrayList arrayList) {
        for (Animal animal : arrayList) {
            add(animal, header);
        }
    }

    // Метод для нахождения узла по индексу
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

    // Метод для получения размера списка
    public int getSize() {
        return size;
    }

    // Вывод всех элементов списка
    public void printList() {
        Node current = header.next;
        while (current != header) {
            System.out.println(current.getElement().getName());
            current = current.next;
        }
    }
}


