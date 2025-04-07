package exercitiul2;

public abstract class Form {
    private String color;

    public Form() {
        this.color = "";
    }

    public Form(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    // pentru punctul h
    public abstract void printDimensions();

    @Override
    public String toString() {
        return color;
    }
}