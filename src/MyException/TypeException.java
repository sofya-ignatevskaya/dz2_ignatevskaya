package MyException;

public class TypeException extends Exception{
    private String message;

    public TypeException(String message) {
        this.message = message;
    }

    @Override
    public void printStackTrace() {
        System.out.println(this.message);
    }
}
