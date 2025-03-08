package az.edu.turing.module1;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        String[][] square = new String[5][5];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square[i][j] = "-";
            }
        }


        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");


        while (true) {

            int row = 0;
            while (true) {
                System.out.println("Enter the line (1-5) for your shot:");
                row = scanner.nextInt();
                if (row >= 1 && row <= 5) {
                    row--;
                    break;
                } else {
                    System.out.println("Wrong input, please enter row number between 1 and 5");
                }
            }


            int column = 0;
            while (true) {
                System.out.println("Enter the shooting bar (1-5) for your shot:");
                column = scanner.nextInt();
                if (column >= 1 && column <= 5) {
                    column--;
                    break;
                } else {
                    System.out.println("Wrong input, please enter column number between 1 and 5");
                }
            }


            if (row == targetRow && column == targetCol) {
                System.out.println("Congrats! You won!");
                square[targetRow][targetCol] = "X";


                printGrid(square);
                break;
            } else {

                square[row][column] = "*";


                printGrid(square);
            }
        }
    }


    public static void printGrid(String[][] square) {





        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(square[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
