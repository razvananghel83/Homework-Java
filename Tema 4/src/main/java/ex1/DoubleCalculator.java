package ex1;

import ex1.exceptions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DoubleCalculator implements Calculator {

    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul dintre termeni este null!");
        }
        double result = a + b;
        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("S-a produs overflow!");
        }
        if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("S-a produs underflow!");
        }
        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, MyArithmeticException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul dintre termeni este null!");
        }
        if (b == 0) {
            throw new MyArithmeticException("Nu se poate efectua impartirea la 0!");
        }
        return a / b;
    }

    @Override
    public double average(Double[] values) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException {
        if (values == null || values.length == 0) {
            throw new NullParameterException("Vectorul este gol sau null!");
        }
        Double sum = 0.0;
        for (Double value : values) {
            sum = add(sum, value);
        }
        return divide(sum, (double) values.length);
    }

    // Citire valori dintr-un fișier
    public Double[] readValuesFromFile(String filename) throws FileProcessingException {
        List<Double> values = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    values.add(Double.parseDouble(line.trim()));
                } catch (NumberFormatException e) {
                    throw new FileProcessingException("Format invalid pentru numarul citit din fisier!", e);
                }
            }
        } catch (IOException e) {
            throw new FileProcessingException("Eroare in citirea fisierului", e);
        }
        return values.toArray(new Double[0]);
    }
}
