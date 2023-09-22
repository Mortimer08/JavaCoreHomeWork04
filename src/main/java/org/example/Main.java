package org.example;

import org.example.MyExceptions.WrongArraySizeException;
import org.example.MyExceptions.WrongElementException;

public class Main {
    public static void main(String[] args) {
        ArrayCreator ac = new ArrayCreator();
        SquareArray sa = ac.makeArray();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            ac.fillArray(sa);
            try {
                sum = sa.calculateSum();
                System.out.printf("The sum of elements is: %d\n",sum);
                sum = 0;
            } catch (WrongElementException e) {
                System.out.println("Wrong element detected");
                e.printStackTrace();
            }
            sa.showArray();
            System.out.println();
        }

    }
}