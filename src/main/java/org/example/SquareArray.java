package org.example;

import org.example.MyExceptions.WrongColumnsNumberException;
import org.example.MyExceptions.WrongElementException;
import org.example.MyExceptions.WrongRowsNumberException;

public class SquareArray {
    private static final int ROWS_NUMBER = 4;
    private static final int COLUMNS_NUMBER = 4;
    private final String[][] squareArray;

    /**
     *
     * @param rows rows in array
     * @param columns columns in array
     * @throws WrongRowsNumberException when Number of rows is not four
     * @throws WrongColumnsNumberException when Number  of columns is not four
     */

    public SquareArray(int rows, int columns) throws WrongRowsNumberException,WrongColumnsNumberException {
        if (!(rows == ROWS_NUMBER)) {
            throw new WrongRowsNumberException("There must be just four rows in the array", rows, columns);
        }
        if (!(columns == COLUMNS_NUMBER)) {
            throw new WrongColumnsNumberException("There must be just four columns in the array", rows, columns);
        }
        squareArray = new String[rows][columns];
    }

    public void putElement(int row, int column, String element) {
        this.squareArray[row][column] = element;
    }

    public String getElement(int row, int column) {
        return squareArray[row][column];
    }

    public int calculateSum() throws WrongElementException {
        int sum = 0;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[0].length; j++) {
                try {
                    sum += Integer.parseInt(squareArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new WrongElementException("Array must contain only numbers", squareArray[i][j]);
                }
            }
        }
        return sum;
    }

    public void showArray() {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[0].length; j++) {
                System.out.printf(" %s ", squareArray[i][j]);
            }
            System.out.println();
        }
    }

    public int getRowsNumber() {
        return squareArray.length;
    }

    public int getColumnsNumber() {
        return squareArray[0].length;
    }
}
