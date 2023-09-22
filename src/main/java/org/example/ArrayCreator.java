package org.example;

import java.util.Random;

public class ArrayCreator {
    private static final Random rnd = new Random();

    public String[][] makeArray() {
        int columns = 4;
        int rows = 4;
        if (rnd.nextInt(1) == 0) {
            columns += rnd.nextInt(3);
            rows += rnd.nextInt(3);
        }
        return new String[rows][columns];
    }

    public void fillArray(String[][] stringArray) {
        String myString;
        Character character;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                if (rnd.nextInt(5) == 0) {
                    character = (char) (65+rnd.nextInt(57));
                    myString = String.valueOf(character);
                } else {
                    myString = String.valueOf(rnd.nextInt(20));
                }
                stringArray[i][j] = myString;
            }
        }
//        return stringArray;
    }
    public void showArray(String [][] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                System.out.printf(" %s ",stringArray[i][j]);
            }
            System.out.println();
        }
    }
}
