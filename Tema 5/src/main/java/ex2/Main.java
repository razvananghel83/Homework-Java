package ex2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        CountingHashSet set = new CountingHashSet();

        set.add(1);
        set.add(2);
        set.add(2);

        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.add(3);
        anotherSet.add(4);
        anotherSet.add(5);
        set.addAll(anotherSet);

        System.out.println(set);
        System.out.println("Size " + set.size());
        System.out.println("Total elemente " + set.getTotalElemente());

        // c) Moștenirea clasei LinkedList<Integer> va permite stocarea duplicatelor.
    }
}
