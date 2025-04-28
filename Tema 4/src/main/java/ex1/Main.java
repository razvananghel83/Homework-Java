package ex1;

public class Main {
    public static void main(String[] args) {

        DoubleCalculator calculator = new DoubleCalculator();
        try {
            Double[] numbers = calculator.readValuesFromFile("src/main/java/ex1/input.txt");
            double avg = calculator.average(numbers);
            System.out.println("Average: " + avg);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}