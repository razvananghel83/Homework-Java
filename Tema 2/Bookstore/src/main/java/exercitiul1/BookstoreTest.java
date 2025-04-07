package exercitiul1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookstoreTest {

    private List<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Cartea " + book.getTitle() + " a fost adăugată");
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean updateBook(String title, String newAuthor, String newPublisher, int newPageCount) {
        Book bookToUpdate = getBookByTitle(title);
        if (bookToUpdate != null) {
            bookToUpdate.setAuthor(newAuthor);
            bookToUpdate.setPublisher(newPublisher);
            bookToUpdate.setPageCount(newPageCount);
            System.out.println("Cartea " + title + " a fost modificata");
            return true;
        }
        System.out.println("Cartea " + title + " nu a fost gasita");
        return false;
    }

    public boolean deleteBook(String title) {
        Book bookToRemove = getBookByTitle(title);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Cartea " + title + " a fost stearsa");
            return true;
        }
        System.out.println("Cartea " + title + " nu a fost gasita");
        return false;
    }

    public Book createBookFromInput() {
        String title = getInputString("Introduceti titlul cartii: ");
        String author = getInputString("Introduceti autorul cartii: ");
        String publisher = getInputString("Introduceti editura cartii: ");
        int pageCount = getInputPageCount();

        return new Book(title, author, publisher, pageCount);
    }

    private String getInputString(String text) {
        System.out.print(text);
        return scanner.nextLine().trim();
    }

    private int getInputPageCount() {
        while (true) {
                System.out.println("\nIntroduceti numarul de pagini al cartii: ");
                int pages = Integer.parseInt(scanner.nextLine().trim());

                if (pages <= 0)
                    System.out.println("Numarul de pagini trebuie sa fie mai mare decat 0. Incercati din nou!");
                else
                    return pages;
        }
    }

    public static void main(String[] args) {

        BookstoreTest bookstore = new BookstoreTest();
        Scanner scanner = new Scanner(System.in);
        bookstore.addBook(bookstore.createBookFromInput());

    }
}

