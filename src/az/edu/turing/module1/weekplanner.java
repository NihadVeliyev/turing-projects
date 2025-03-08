package az.edu.turing.module1;

import javax.swing.*;
import java.util.Scanner;

public class weekplanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "monday";
        schedule[0][1] = "Do homework";
        schedule[1][0] = "tuesday";
        schedule[1][1] = "Go to courses";
        schedule[2][0] = "wednesday";
        schedule[2][1] = "Read a book";
        schedule[3][0] = "thursday";
        schedule[3][1] = "Go to the gym";
        schedule[4][0] = "friday";
        schedule[4][1] = "Watch a movie";
        schedule[5][0] = "saturday";
        schedule[5][1] = "Relax";
        schedule[6][0] = "sunday";
        schedule[6][1] = "Prepare for the week";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = scanner.nextLine().trim().toLowerCase();


            if (input.equals("exit")) {
                break;
            }





            if(input.startsWith("change")) {
                String day = input.substring(7).trim().toLowerCase();
                switch (day) {
                    case "monday":
                        System.out.println("Input Your task for Monday : ");
                        schedule[0][1] = scanner.nextLine();
                        break;

                    case "tuesday":
                        System.out.println("Input Your task for Tuesday : ");
                        schedule[1][1] = scanner.nextLine();
                        break;

                    case "wednesday":
                        System.out.println("Input Your task for Wednesday : ");
                        schedule[2][1] = scanner.nextLine();
                        break;

                    case "thursday":
                        System.out.println("Input Your task for Thursday : ");
                        schedule[3][1] = scanner.nextLine();
                        break;

                    case "friday":
                        System.out.println("Input Your task for Friday : ");
                        schedule[4][1] = scanner.nextLine();
                        break;

                    case "saturday":
                        System.out.println("Input Your task for Saturday : ");
                        schedule[5][1] = scanner.nextLine();
                        break;

                    case "sunday":
                        System.out.println("Input Your task for Sunday : ");
                        schedule[6][1] = scanner.nextLine();
                        break;

                    default:
                        System.out.println("Sorry, I don't understand that day. Please try again.");
                        break;



                }


            }else{
                switch (input) {
                    case "monday":
                        System.out.println("Your task for Monday is: " + schedule[0][1]);
                        break;
                    case "tuesday":
                        System.out.println("Your task for Tuesday is: " + schedule[1][1]);
                        break;
                    case "wednesday":
                        System.out.println("Your task for Wednesday is: " + schedule[2][1]);
                        break;
                    case "thursday":
                        System.out.println("Your task for Thursday is: " + schedule[3][1]);
                        break;
                    case "friday":
                        System.out.println("Your task for Friday is: " + schedule[4][1]);
                        break;
                    case "saturday":
                        System.out.println("Your task for Saturday is: " + schedule[5][1]);
                        break;
                    case "sunday":
                        System.out.println("Your task for Sunday is: " + schedule[6][1]);
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                }
            }


        }
        scanner.close();
        }




    }

