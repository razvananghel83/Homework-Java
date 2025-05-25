package ex1;

public class Student {

    private String nume;
    private float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public double getMedie() {
        return medie;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return " ( " + nume + "; " +  medie + " ) ";
    }
}
