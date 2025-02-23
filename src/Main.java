package az.edu.turing;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Take user input
        System.out.print("Enter your name: ");
        String name = scanner.next();

        int yournumber = 0;
        int secretnumber = random.nextInt(100) + 1;
        int[] array = new int[100];
        int attempts = 0;


        while (secretnumber != yournumber) {
            System.out.print("Enter your  number; ");
            yournumber = scanner.nextInt();
            array[attempts] = yournumber;
            attempts++;

            if (yournumber < 1 || yournumber > 100) {
                System.out.println("Please enter valid number between 1 and 100");
            } else if (yournumber < secretnumber) {
                System.out.println("Your number is too small");
            } else if (yournumber > secretnumber) {
                System.out.println("Your number is too big");

            }
            for (int i = 0; i < attempts - 1; i++) {
                for (int j = i + 1; j < attempts; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.println("Congratulations " + name + "you win the game");
            System.out.println("Your numbers ");
            for (int i = 0; i < attempts; i++) {
                System.out.println(array[i]);

            }


            scanner.close(); // Always close the scanner
        }
    }
}
