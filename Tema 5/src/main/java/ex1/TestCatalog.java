package ex1;

import java.util.Comparator;
import java.util.List;

// e)
public class TestCatalog {
    public static void main(String[] args) {

        ComparatorMediiDescrescator comparator = new ComparatorMediiDescrescator();
        Catalog catalog = new Catalog(comparator);

        catalog.adaugaStudent(new Student("Ion Popescu", 7.50f));
        catalog.adaugaStudent(new Student("Maria Enache", 8.49f));
        catalog.adaugaStudent(new Student("Ana Ionescu", 8.55f));
        catalog.adaugaStudent(new Student("Mihai Zamfir", 9.07f));
        catalog.adaugaStudent(new Student("Andrei Dragomir", 7.65f));


        for (List<Student> listaStudenti : catalog.getStudenti().values()) {

            listaStudenti.sort(Comparator.comparing(Student::getNume));
        }
        catalog.getStudenti().forEach((medie, studenti) ->
                System.out.println("Medie " + medie + ": " + studenti)
        );

    }
}
