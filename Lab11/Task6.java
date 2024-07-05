package Lab11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task6 {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        for (int number = 0; number < 100000; number++) {
            numberList.add(number);
        }

        long startTimeIndex = System.nanoTime();
        for (int index = 0; index < numberList.size(); index++) {
            numberList.get(index);
        }
        long endTimeIndex = System.nanoTime();
        System.out.println("index: " + (endTimeIndex - startTimeIndex) + " ns");

        long startTimeIterator = System.nanoTime();
        ListIterator<Integer> listIterator = numberList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        long endTimeIterator = System.nanoTime();
        System.out.println("iterator: " + (endTimeIterator - startTimeIterator) + " ns");
    }
}
