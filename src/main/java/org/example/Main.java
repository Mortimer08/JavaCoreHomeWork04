package org.example;

import org.example.MyExceptions.WrongColumnsNumberException;
import org.example.MyExceptions.WrongElementException;
import org.example.MyExceptions.WrongRowsNumberException;

public class Main {
    public static void main(String[] args) {
        ArrayCreator ac = new ArrayCreator();
        SquareArray sa = null;
        int sum;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Attempt %d\n", i);
            try {
                sa = ac.makeArray();
                ac.fillArray(sa);
                try {
                    sum = sa.calculateSum();
                    System.out.printf("The sum of elements is: %d\n", sum);
//                    sum = 0;
                } catch (WrongElementException e) {
                    System.out.printf("Wrong element detected: %s\n", e.getElement());
//                    e.printStackTrace();
                }
            } catch (WrongRowsNumberException e) {
                System.out.printf("Wrong array size detected, rows = %d\n", e.getRows());
//                e.printStackTrace();
            } catch (WrongColumnsNumberException e) {
            System.out.printf("Wrong array size detected, columns = %d\n", e.getColumns());
//                e.printStackTrace();
        }
            try {
                sa.showArray();
                System.out.println();
            } catch (NullPointerException e) {
                System.out.println("Array is empty");
            }
        }
    }
}