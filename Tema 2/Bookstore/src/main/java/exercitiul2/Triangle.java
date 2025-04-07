package exercitiul2;

public class Triangle extends Form {

    private float height;
    private float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public void printTriangleDimensions() {
        System.out.println("Dimensiuni triunghi: bază=" + base + ", înălțime=" + height);
    }

    @Override
    public double getArea() {
        return (height * base) / 2;
    }

    @Override
    public void printDimensions() {
        System.out.println("Dimensiuni triunghi: bază=" + base + ", înălțime=" + height);
    }

    @Override
    public String toString() {
        return "Triunghi: " + super.toString() + " " + this.getArea();
    }

    /* *
     * Am considerat doua triunghiuri ca fiind egale daca au culoare identica si baza si inaltime egale.
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangle other = (Triangle) obj;

        return super.toString().equals(other.toString()) &&
                Math.abs(this.height - other.height) < 0.0001 &&
                Math.abs(this.base - other.base) < 0.0001;
    }

    public static void main(String[] args) {

        Triangle t1 = new Triangle("rosu", 5, 3);
        System.out.println("Aria triunghiului: " + t1.getArea());

        Triangle t2 = new Triangle("rosu", 5, 4);
        System.out.println(t2.toString());


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