import java.util.*;

/**
 * This program will read the information for one book
 * it will validate it and print it if correct
 *
 * @author hr6134
 *         02.12.15
 */
public class BookStore {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.println();

            System.out.print("Enter isbn: ");
            int isbn = sc.nextInt();
            System.out.println();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.println();

            Book book = Book.create(title, isbn, quantity); //attempting to create the book

            //if any information about the book is inconsistent the BookException will be
            //thrown by the Book constructor/set methods and it should be caught
            System.out.println("The book entered was:");
            System.out.println(book.toString());
        } catch (BookException be) {
            System.out.println(be.getMessage()); //calling the getMessage from BookException.java
        }

    }
}
