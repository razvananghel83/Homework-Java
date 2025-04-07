package exercitiul1;

import java.util.List;
import java.util.ArrayList;

public class BookstoreCheck {

    public boolean hasDuplicate(Book book, List<Book> bookList) {
        int count = 0;
        for (Book b : bookList) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle()) &&
                    b.getAuthor().equalsIgnoreCase(book.getAuthor())) {
                count++;
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public Book getThickerBook(Book book1, Book book2) {
        if (book1.getPageCount() > book2.getPageCount()) {
            return book1;
        } else if (book2.getPageCount() > book1.getPageCount()) {
            return book2;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book("The Art Of Computer Programming", "Donald E. Knuth", "Pearson Education", 1568);
        Book book2 = new Book("The Art Of Computer Programming", "Donald E. Knuth", "Pearson Education", 1568);
        Book book3 = new Book("Introduction To Algorithms", "Thomas H. Cormen", "Mit Press", 1344);
        Book book4 = new Book("Operating System Concepts", "Abraham Silbershartz", "Wiley", 1121);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        BookstoreCheck checker = new BookstoreCheck();

        System.out.println("Testare duplicat");
        System.out.println("Are 'The Art Of Computer Programming' duplicat? " + checker.hasDuplicate(book1, bookList));
        System.out.println("Are 'Operating System Concepts' duplicat? " + checker.hasDuplicate(book4, bookList));

        Book thickerBook = checker.getThickerBook(book3, book4);
        System.out.println();
        System.out.println("Cartea mai groasa dintre " + book3.getTitle() + " si " + book4.getTitle() + " este " +
                (thickerBook != null ? thickerBook.getTitle() : "cartile au aceeasi grosime"));

        thickerBook = checker.getThickerBook(book1, book2);
        System.out.println("Cartea mai groasa dintre " + book1.getTitle() + " si " + book2.getTitle() + " este " +
                (thickerBook != null ? thickerBook.getTitle() : "cartile au aceeasi grosime"));
    }
}