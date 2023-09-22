package org.example;

import org.example.MyExceptions.WrongArraySizeException;
import org.example.MyExceptions.WrongColumnsNumberException;
import org.example.MyExceptions.WrongElementException;
import org.example.MyExceptions.WrongRowsNumberException;

import java.util.Random;

public class ArrayCreator {
    private static final Random rnd = new Random();

    public SquareArray makeArray() {
        int columns = 4;
        int rows = 4;
        if (false/*rnd.nextInt(1) == 0*/) {
            columns += rnd.nextInt(3);
            rows += rnd.nextInt(3);
        }
        try {

            return new SquareArray(rows, columns);
        } catch (WrongArraySizeException e) {
            System.out.println("Wrong array size detected");
            e.printStackTrace();
        }
        return null;
    }

    public void fillArray(SquareArray stringArray) {
        String myString;
        Character character;
        for (int i = 0; i < stringArray.getRowsNumber(); i++) {
            for (int j = 0; j < stringArray.getColumnsNumber(); j++) {
                if (rnd.nextInt(5) == 0) {
                    character = (char) (65 + rnd.nextInt(57));
                    myString = String.valueOf(character);
                } else {
                    myString = String.valueOf(rnd.nextInt(20));
                }
                stringArray.putElement(i, j, myString);
            }
        }
    }

    /*public void showArray(String[][] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                System.out.printf(" %s ", stringArray[i][j]);
            }
            System.out.println();
        }
    }*/


    /*public int calculateSum(String[][] stringArray) throws WrongElementException {
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                try {
                    sum += Integer.parseInt(stringArray[i][j]);
                }catch (NumberFormatException e){
                    throw new WrongElementException("Array must contain only numbers", stringArray[i][j]);
                }
            }
        }
        return sum;
    }*/

    public boolean isNumeric(String myString) {

        return false;
    }
}
