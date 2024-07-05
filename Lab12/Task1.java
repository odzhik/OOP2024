package Lab12;

import java.util.LinkedHashSet;

public class Task1 {

    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        LinkedHashSet<String> cloneSet1 = new LinkedHashSet<>(set1);
        LinkedHashSet<String> cloneSet2 = new LinkedHashSet<>(set2);

        LinkedHashSet<String> union = new LinkedHashSet<>(cloneSet1);
        union.addAll(cloneSet2);
        System.out.println("Union: " + union);

        LinkedHashSet<String> difference1 = new LinkedHashSet<>(cloneSet1);
        difference1.removeAll(cloneSet2);
        System.out.println("Difference (s1 - s2): " + difference1);

        LinkedHashSet<String> difference2 = new LinkedHashSet<>(cloneSet2);
        difference2.removeAll(cloneSet1);
        System.out.println("Difference (s2 - s1): " + difference2);

        LinkedHashSet<String> intersection = new LinkedHashSet<>(cloneSet1);
        intersection.retainAll(cloneSet2);
        System.out.println("Intersection: " + intersection);
    }
}

