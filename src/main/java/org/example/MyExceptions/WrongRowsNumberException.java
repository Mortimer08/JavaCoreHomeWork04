package org.example.MyExceptions;

public class WrongRowsNumberException extends WrongArraySizeException{
    public WrongRowsNumberException(String message, int rows, int columns) {
        super(message, rows, columns);

    }
}
