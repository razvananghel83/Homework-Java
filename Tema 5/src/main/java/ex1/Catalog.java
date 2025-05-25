package ex1;

import java.util.*;


public class Catalog {

    private final Map<Double, List<Student>> studenti;

    public Catalog(Comparator<Double> comparatorMedii) {    // c)
        this.studenti = new TreeMap<>(comparatorMedii);
    }

    public void adaugaStudent(Student student) {   // d)

        double medieRotunjita = rotunjesteMedie(student.getMedie());
        if ( medieRotunjita >= 0 && medieRotunjita <= 10 )    // a)
            studenti.computeIfAbsent(medieRotunjita, k -> new ArrayList<>()).add(student);
    }

    private int rotunjesteMedie(double medie) {   // b)
        return (int) Math.round(medie);
    }


    public Map<Double, List<Student>> getStudenti() {
        return studenti;
    }
}
