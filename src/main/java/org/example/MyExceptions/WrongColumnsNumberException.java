package org.example.MyExceptions;

public class WrongColumnsNumberException extends WrongArraySizeException{
    public WrongColumnsNumberException(String message, int rows, int columns) {
        super(message, rows, columns);
    }
}
