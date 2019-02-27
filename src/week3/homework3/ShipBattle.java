package week3.homework3;

import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {

        String[][] gameField = generateField(5);
        String[][] userField = generateField(5);
        int minShipSize = 2;

        generateShip(gameField, minShipSize);

        startGame(gameField, userField);
    }

    private static void startGame(String[][] gameField, String[][] userField) {
        Scanner sc = new Scanner(System.in);
        printField(userField);

        while (!isVictory(gameField)) {
            System.out.println("enter the row");
            int row = sc.nextInt();
            System.out.println("enter the column");
            int column = sc.nextInt();
            row--;
            column--;

            boolean hit = hit(userField, gameField, row, column);
            if(hit) {
                System.out.println("Hit!");
            } else {
                System.out.println("Miss(");

                hint(gameField, row, column);

            }
            printField(userField);
        }
        System.out.println("win!");


    }

    private static void hint(String[][] gameField, int row, int column) {
        int realRow = -1;
        int realColumn = -1;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if(gameField[i][j].equals("X")) {
                    realRow = i;
                    realColumn = j;
                    break;
                }
            }
        }

        String hint = "";
        if(row < realRow){
            hint = hint + "down ";
        } else if( row > realRow){
            hint = hint + "Up";
        }
        if (column < realColumn){
            hint = hint + "right";
        } else if(column > realColumn) {
            hint += "left";
        }

        System.out.println(hint);
    }

    private static boolean hit(String[][] userField, String[][] gameField, int row, int column) {
        if (gameField[row][column].equals("X")) {
            gameField[row][column] = "+";
            userField[row][column] = "x";
            return true;
        } else {
            userField[row][column] = ".";
            return false;
        }

    }


    private static boolean isVictory(String[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                String element = gameField[i][j];
                if (element.equals("X"))
                    return false;
            }

        }
        return true;
    }


    //generate a ship
    public static void generateShip(String gameField[][], int minShipSize) {
        boolean vert = Math.random() > 0.5;
        int shipSize = (int) (Math.random() * (gameField.length - minShipSize) + minShipSize);
        int startIndex = (int) (Math.random() * (gameField.length - shipSize));
        if (vert) {
            int column = (int) (Math.random() * gameField.length);
            for (int i = startIndex; i < startIndex + shipSize; i++) {
                gameField[i][column] = "X";
            }
        } else {
            int row = (int) (Math.random() * gameField.length);
            for (int i = startIndex; i < startIndex + shipSize; i++) {
                gameField[row][i] = "X";
            }
        }
    }


    private static String[][] generateField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = "o";
            }

        }
        return field;
    }


    //print field

    public static void printField(String[][] userField) {

        for (int i = 0; i < userField.length; i++) {
            for (int j = 0; j < userField.length; j++) {
                System.out.print(userField[i][j] + " ");
            }
            System.out.println();
        }

    }
}