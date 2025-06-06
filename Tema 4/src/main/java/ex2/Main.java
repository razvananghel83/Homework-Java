package ex2;

import ex1.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    // a. Metoda pentru găsirea celui mai lung cuvânt
    public static String findLongestWord(String fileName) throws IOException {

        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {

                String[] words = line.split("\\s+"); // separăm pe spațiu
                for (String word : words) {

                    if (word.length() > longestWord.length())
                        longestWord = word;
                }
            }
        }
        return longestWord;
    }

    // b. Metoda pentru a adăuga conținutul clasei în fișier
    public static void addClassContentToFile(Class<?> c, String fileName) throws IOException {

        String sourceFileName = "src/main/java/ex2/" + c.getSimpleName() + ".java";
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { // true -> adaugă la final

            writer.newLine();
            writer.write("===== Start of " + sourceFileName + " content =====");
            writer.newLine();
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.write("===== End of " + sourceFileName + " content =====");
            writer.newLine();
        }
    }

    // c. Metoda pentru a citi fișierul linie cu linie într-un array
    public static String[] readFileIntoArray(String fileName) throws IOException {

        List<String> linesList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
        }
        return linesList.toArray(new String[0]);
    }


    public static void main(String[] args) {

        String inputFileName = "src/main/java/ex1/input.txt";

        // a. Cel mai lung cuvânt
        try {
            String longestWord = findLongestWord(inputFileName);
            System.out.println("Cel mai lung cuvant din fisier este: " + longestWord);
        } catch (IOException e) {
            System.err.println("Eroare la citirea fisierului: " + e.getMessage());
        }

        // b. Adaugarea conținutului clasei curente în fișier
        try {
            addClassContentToFile(Main.class, inputFileName);
            System.out.println("Continutul clasei a fost adaugat in fisier.");
        } catch (IOException e) {
            System.err.println("Eroare la scrierea in fisier: " + e.getMessage());
        }

        // c. Salvarea fiec[rei linii într-un array
        try {
            String[] lines = readFileIntoArray(inputFileName);
            System.out.println("Continutul fisierului linie cu linie:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Eroare la citirea fisierului: " + e.getMessage());
        }
    }
}

