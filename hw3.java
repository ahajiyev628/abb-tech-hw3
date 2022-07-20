import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] tasks = {"do homework", "go to courses", "watch a film", "play a game", "meet with friends", "go for shopping", "go to sport"};

        // fill schedule array with weekdays and corresponding tasks
        int i = 0;
        for (String weekday : weekdays) {
            schedule[i++][0] = weekday;
        }
        int j = 0;
        for (String task : tasks) {
            schedule[j++][1] = task;
        }

        // scanner class to get input from user
        Scanner sc  = new Scanner(System.in);

        boolean breakLoop = true;

        while(breakLoop) {
            // get the weekday as an input from the user
            System.out.print("Please, input the day of the week: ");
            String day = sc.next();
            // make it lowercase, remove the spaces and then check the corresponding task for that day
            switch (day.toLowerCase().trim()) {
                case "sunday":
                    System.out.printf("Your tasks for %s: %s.\n", schedule[0][0], schedule[0][1]);
                    break;
                case "monday":
                    System.out.printf("Your tasks for %s: %s.\n", schedule[1][0], schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s: %s.\n", schedule[2][0], schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your tasks for %s: %s.\n", schedule[3][0], schedule[3][1]);
                    break;
                case "thursday":
                    System.out.printf("Your tasks for %s: %s.\n", schedule[4][0], schedule[4][1]);
                    break;
                case "friday":
                    System.out.printf("Your tasks for %s: %s.\n", schedule[5][0], schedule[5][1]);
                    break;
                case "saturday":
                    System.out.printf("Your tasks for %s: %s.\n", schedule[6][0], schedule[6][1]);
                    break;
                    // exit the loop
                case "exit":
                    breakLoop = false;
                    break;
                    // if user has entered any other string rather than weekday
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
