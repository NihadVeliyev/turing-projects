import java.util.Scanner;

public class WeekPlanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {

        String[][] weekDays = new String[7][2];
        String day;

        fillTheDays(weekDays);

        while (true) {

            System.out.println("Please, input the day of the week:");
            day = scanner.nextLine().trim();

            if (day.equalsIgnoreCase("exit")) {
                break;
            } else if (day.startsWith("change")) {
                System.out.println(changeTask(day, weekDays));
            } else {
                System.out.println(showTask(day, weekDays));
            }
        }

    }

    private static String showTask(String day, String[][] weekDays) {

        for (String[] weekDay : weekDays) {
            if (weekDay[0].equalsIgnoreCase(day)) {
                return weekDay[1];
            }
        }
        return "Sorry, I don't understand you, please try again.";
    }

    private static String changeTask(String day, String[][] weekDays) {

        switch (day.substring(6).toLowerCase().trim()) {
            case "monday":
                System.out.println("Please, input new task for Monday:");
                weekDays[0][1] = scanner.nextLine().trim();
                return weekDays[0][1];
            case "tuesday":
                System.out.println("Please, input new task for Tuesday:");
                weekDays[1][1] = scanner.nextLine().trim();
                return weekDays[1][1];
            case "wednesday":
                System.out.println("Please, input new task for Wednesday:");
                weekDays[2][1] = scanner.nextLine().trim();
                return weekDays[2][1];
            case "thursday":
                System.out.println("Please, input new task for Thursday:");
                weekDays[3][1] = scanner.nextLine().trim();
                return weekDays[3][1];
            case "friday":
                System.out.println("Please, input new task for Friday:");
                weekDays[4][1] = scanner.nextLine().trim();
                return weekDays[4][1];
            case "saturday":
                System.out.println("Please, input new task for Saturday:");
                weekDays[5][1] = scanner.nextLine().trim();
                return weekDays[5][1];
            case "sunday":
                System.out.println("Please, input new task for Sunday:");
                weekDays[6][1] = scanner.nextLine().trim();
                return weekDays[6][1];
            default:
                return "Sorry, I don't understand you, please try again.";
        }

    }


    private static void fillTheDays(String[][] weekDays) {
        weekDays[0][0] = "Monday";
        weekDays[0][1] = "Go To Work; Go To Cinema";
        weekDays[1][0] = "Tuesday";
        weekDays[1][1] = "Hang Out With Cute GirlFriend";
        weekDays[2][0] = "Wednesday";
        weekDays[2][1] = "Go To Bank; Go To Gym";
        weekDays[3][0] = "Thursday";
        weekDays[3][1] = "Go To Family Dinner; Read A Book";
        weekDays[4][0] = "Friday";
        weekDays[4][1] = "Make A Plan For Weekend; Go To Party";
        weekDays[5][0] = "Saturday";
        weekDays[5][1] = "Do Whatever You Want";
        weekDays[6][0] = "Sunday";
        weekDays[6][1] = "Hang Out With Friends; Go To Park";
    }

}