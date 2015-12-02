import java.util.*;

/**
 * this program will read the information for one book
 * it will validate it and print it if correct
 *
 * @author hr6134
 *         02.12.15
 */
public class BookStore {

//this program will read the information for one book
//it will validate it and print it if correct

    public static void main(String arg[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int size = 3;
        int isbn = 0;
        int quantity = 0;
        String title = "";
        int count = 0;
        boolean exit = false;
        Book oneBook;

        try {
            System.out.print("Enter title: ");
            title = sc.nextLine();
            sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter isbn: ");
            isbn = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println();
            oneBook = new Book(title, isbn, quantity); //attempting to create the book
            //if any information about the book is inconsistent the BookExcpetion will be
            //thrown by the Book constructor/set methods and it should be caught
            System.out.println("The book entered was:");
            System.out.println(oneBook.toString());
        } catch (InputMismatchException ime) {
            System.out.println("you did not enter a number");
        } catch (BookException be) {
            System.out.println(be.getMessage()); //calling the getMessage from BookException.java
        }

    } //main method
} //class
