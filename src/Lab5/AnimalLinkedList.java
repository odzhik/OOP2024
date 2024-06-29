package Lab6;
import java.util.LinkedList;
import Lab5.Animal;
import Lab5.AnimalArrayList;
import java.util.ArrayList;


public class AnimalLinkedList extends ArrayList<Animal> {
    private class Node {
        Animal element;
        Node prev;
        Node next;

        Node(Animal element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
    private int size;
    private Node header;

    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.next = header;
        header.prev = header;
        size = 0;
    }

    private void add(Animal animal, Node node) {
        Node newNode = new Node(animal, null, node);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
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

    // Метод для нахождения узла по индексу
    private Node findNodeByIndex(int i) {
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
            System.out.println(current.element.getName());
            current = current.next;
        }
    }

    public static void main(String[] args) {
        AnimalLinkedList list = new AnimalLinkedList();
        list.add(new Animal("Dog"));
        list.add(new Animal("Cat"));
        list.add(new Animal("Cow"));

        list.printList(); // Выводит: Dog, Cat, Cow
        System.out.println("Size: " + list.getSize()); // Выводит: Size: 3

        // Пример использования метода findNodeByIndex
        Node node = list.findNodeByIndex(1);
        System.out.println("Element at index 1: " + node.element.getName()); // Выводит: Element at index 1: Cat
    }
}
