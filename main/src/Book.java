/**
 * Immutable book class.
 * Instance could be created through static factory method.
 *
 * @author hr6134
 *         02.12.15
 */
public class Book {
    private final String title;
    private final int isbn;
    private final int quantity;

    private Book(String title, int isbn, int quantity) {
        this.title = title;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public static Book create(String title, int isbn, int quantity) throws BookException {
        validateTitle(title);
        validateIsbn(isbn);
        validateQuantity(quantity);
        return new Book(title, isbn, quantity);
    }

    private static void validateTitle(String title) throws BookException {
        if (title.length() < 1) {
            BookException be = new BookException();
            be.setMessage("Title cannot be blank");
            throw be;
        }
    }

    private static void validateIsbn(int isbn) throws BookException {
        if (isbn <= 1000 || isbn >= 10000) {
            BookException be = new BookException();
            be.setMessage("ISBN should be between 1000 and 10000.");
            throw be;
        }
    }

    private static void validateQuantity(int quantity) throws BookException {
        if (quantity < 0) {
            BookException be = new BookException();
            be.setMessage("Quantity can't be a negative number.");
            throw be;
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s \nISBN: %s \nQuantity: %s", title, isbn, quantity);
    }
}

