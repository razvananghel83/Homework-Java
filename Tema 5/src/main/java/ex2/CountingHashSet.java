package ex2;

import java.util.HashSet;
import java.util.Collection;

public class CountingHashSet extends HashSet<Integer> {

    // a)
    private int totalElemente = 0;

    @Override
    public boolean add(Integer value) {

        boolean wasAdded = super.add(value);
        if (wasAdded)
            totalElemente++;
        return wasAdded;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> collection) {

        // Prin această implementare, se numără greșit elementele. Duplicatele din collection sunt numărate și adăugate
        // la CountingHashSet.
//        int sizeBefore = this.size();
//        boolean wasChanged = super.addAll(collection);
//        if (wasChanged)
//            totalElemente += (this.size() - sizeBefore);
//        return wasChanged;

        boolean wasChanged = false;
        for (Integer element : collection) {
            wasChanged |= add(element); // Folosește add() suprascris, care gestionează counting
        }
        return wasChanged;
    }

    public int getTotalElemente() {
        return totalElemente;
    }
}
