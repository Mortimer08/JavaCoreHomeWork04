package org.example;

import org.example.MyExceptions.WrongColumnsNumberException;
import org.example.MyExceptions.WrongRowsNumberException;

import java.util.Random;

public class ArrayCreator {
    private static final Random rnd = new Random();

    public SquareArray makeArray() throws WrongRowsNumberException, WrongColumnsNumberException {
        int columns = 4;
        int rows = 4;
        if (rnd.nextInt(2) == 0) {
            columns += rnd.nextInt(3);
            rows += rnd.nextInt(3);
        }

        return new SquareArray(rows, columns);
    }



    public void fillArray(SquareArray stringArray) {
        String myString;
        Character character;
        for (int i = 0; i < stringArray.getRowsNumber(); i++) {
            for (int j = 0; j < stringArray.getColumnsNumber(); j++) {
                if (rnd.nextInt(100) == 0) {
                    character = (char) (65 + rnd.nextInt(57));
                    myString = String.valueOf(character);
                } else {
                    myString = String.valueOf(rnd.nextInt(20));
                }
                stringArray.putElement(i, j, myString);
            }
        }
    }
}
