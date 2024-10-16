package ru.tuxuu.java.basic.homeworks.homework8;

public class AppArrayDataException extends RuntimeException {
    public AppArrayDataException() {
    }

    public AppArrayDataException(String massege) {
        super(massege);
    }

    public AppArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppArrayDataException(Throwable cause) {
        super(cause);
    }

    public AppArrayDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
