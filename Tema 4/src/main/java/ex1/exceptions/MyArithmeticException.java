package ex1.exceptions;

public class MyArithmeticException extends ArithmeticException {
    public MyArithmeticException(String message) {
        super(message);
    }
}