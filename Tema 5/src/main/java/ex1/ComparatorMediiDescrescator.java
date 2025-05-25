package ex1;

import java.util.Comparator;

// c)
class ComparatorMediiDescrescator implements Comparator<Double> {

    @Override
    public int compare(Double a, Double b) {
        return b.compareTo(a);
    }
}