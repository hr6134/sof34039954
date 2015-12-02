/**
 * @author hr6134
 *         02.12.15
 */
public class BookException extends Exception {
    //instance variable
    private String message = "";

    public BookException() {
//empty constructor

    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public String getMessage() {
        return this.message;
    }
}