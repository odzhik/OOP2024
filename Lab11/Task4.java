package Lab11;

import java.util.ArrayList;
import java.util.HashSet;

public class Task4 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }


}
