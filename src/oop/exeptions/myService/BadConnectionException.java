package oop.exeptions.myService;

public class BadConnectionException extends Exception {
    public BadConnectionException(String message) {
        super(message);
    }
}
