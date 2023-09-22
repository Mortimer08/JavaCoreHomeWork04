package org.example.MyExceptions;

public class WrongElementException extends Exception{
    String arrayElement;
    public WrongElementException(String message, String element){
        super(message);
        this.arrayElement = element;
    }
    public String getElement(){
        return arrayElement;
    }
}
