package exercitiul2;

import java.util.Arrays;

public class Circle extends Form {

    private float radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public void printCircleDimensions() {
        System.out.println("Rază cerc: " + radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printDimensions() {
        System.out.println("Rază cerc: " + radius);
    }

    @Override
    public String toString() {
        return "Cerc: " + super.toString() + " " + this.getArea();
    }

    public static void main(String[] args) {

        Circle c1 = new Circle("albastru", 4);
        System.out.println("Aria cercului: " + c1.getArea());

        Circle c2 = new Circle("verde", 2);
        System.out.println(c2.toString());

        Form[] forms = new Form[4];

        forms[0] = new Triangle("rosu", 5.0f, 4.0f);
        forms[1] = new Circle("albastru", 3.0f);
        forms[2] = new Triangle("verde", 2.0f, 6.0f);
        forms[3] = new Circle("galben", 1.5f);

        System.out.println();
        System.out.println("Parcurgerea vectorului:");
        for (Form form : forms) {
            System.out.println(form.toString()); // s-au apelat metodele toString() din clasele derivate
        }

        System.out.println();
        System.out.println("Parcurgerea vectorului folosind instanceof:");
        for (Form form : forms) {
            if (form instanceof Triangle) {
                Triangle triangle = (Triangle) form;
                triangle.printTriangleDimensions();
            } else if (form instanceof Circle) {
                Circle circle = (Circle) form;
                circle.printCircleDimensions();
            }
        }

        System.out.println();
        System.out.println("Parcurgerea vectorului fara instanceof:");
        for (Form form : forms) {
            form.printDimensions();
        }
    }
}