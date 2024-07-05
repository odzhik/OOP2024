package Lab11;

public class Task2 {

    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }

        E maxElement = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(maxElement) > 0) {
                maxElement = list[i];
            }
        }
        return maxElement;
    }

}
