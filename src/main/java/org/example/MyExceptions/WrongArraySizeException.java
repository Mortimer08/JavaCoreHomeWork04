package org.example.MyExceptions;

public class WrongArraySizeException extends Exception{
    int rows;
    int columns;
    public WrongArraySizeException(String message, int rows, int columns){
        super(message);
        this.rows = rows;
        this.columns = columns;
    }
    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }
}
