/**
 * @author hr6134
 *         02.12.15
 */
public class Book {
    //instance variables
    private String title = "";
    private int isbn;
    private int quantity;

    public Book(String title, int isbn, int quantity) throws BookException {
        //constructors
        settitle(title);
        setquantity(quantity);
        setisbn(isbn);
    }

    public String toString() { //toString Method

        String s = "";
        s = s + "Title: " + this.title + "\nISBN: " + this.isbn
                + "\nQuantity: " + this.quantity + "\n";
        return s;

    }

    public String gettitle() {
        return this.title;
    }

    public int getisbn() {
        return this.isbn;
    }

    public int getquantity() {
        return this.quantity;
    }

    //mutator methods
    public void settitle(String newtitle) throws BookException {
        if (newtitle.length() < 1) {
            BookException be = new BookException();
            be.setMessage("Title cannot be blank");
            throw be;
        } else {
            this.title = newtitle;
        }
    }

    public void setisbn(int newisbn) throws BookException {
        if (newisbn >= 1000 && newisbn >= 10000) {
            this.isbn = newisbn;
        } else {
            BookException be = new BookException();
            be.setMessage("ISBN should be between 1000 and 10000.");
            throw be;
        }
    }

    public void setquantity(int newquantity) throws BookException {
        if (newquantity >= 0) {
            this.quantity = newquantity;
        } else {
            BookException be = new BookException();
            be.setMessage("Quantity can't be a negative number.");
            throw be;
        }
    }

}

