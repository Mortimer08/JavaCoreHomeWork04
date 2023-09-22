package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println((char) 65);
        ArrayCreator ac = new  ArrayCreator();
        String[][] myArray = ac.makeArray();
        ac.fillArray(myArray);
        ac.showArray(myArray);
    }
}