package MyException;

public class WrongFoodException extends Exception {
    private String message;

    public WrongFoodException(String message) {
        this.message = message;
    }

    @Override
    public void printStackTrace() {
        System.out.println(this.message);
    }
}
