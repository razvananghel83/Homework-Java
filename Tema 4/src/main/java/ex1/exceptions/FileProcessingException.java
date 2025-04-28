package ex1.exceptions;

public class FileProcessingException extends Exception {

    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}