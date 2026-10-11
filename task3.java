import java.util.Random;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aliX = 0, aliY = 0;
        int hasanX = 0, hasanY = 0;

        // Hurdle location
        int hurdleX = 1, hurdleY = 2;

        System.out.println(
                "Starting: Ali's Location = (" + aliX + ":" + aliY + ")"
        );

        System.out.println(
                "Hassan's Location = (" + hasanX + ":" + hasanY + ")"
        );

        System.out.println(
                "Hassan has Random Movement. Ali follows order."
        );

        boolean running = true;

        while (running) {

            System.out.print(
                    "Ali: Where should I go now (^, v, <, > or q to quit): "
            );

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            // Update Ali's position
            if (input.equals("^")) {
                aliY++;
            }
            else if (input.equals("v")) {
                aliY--;
            }
            else if (input.equals("<")) {
                aliX--;
            }
            else if (input.equals(">")) {
                aliX++;
            }
            else {
                System.out.println("Invalid direction!");
            }

            System.out.println(
                    "Ali is at = (" + aliX + ":" + aliY + ")"
            );

            // Hassan's random movement
            int randomMoveX = random.nextInt(3) - 1;
            int randomMoveY = random.nextInt(3) - 1;

            int nextHasanX = hasanX + randomMoveX;
            int nextHasanY = hasanY + randomMoveY;

            // Check hurdle
            if (nextHasanX == hurdleX &&
                    nextHasanY == hurdleY) {

                System.out.println(
                        "Hassan encounters hurdle at (" +
                                hurdleX + ":" + hurdleY + ")"
                );

                // Hassan stays in previous position
            }
            else {
                hasanX = nextHasanX;
                hasanY = nextHasanY;
            }

            System.out.println(
                    "Hassan is at = (" + hasanX + ":" + hasanY + ")"
            );
        }

        scanner.close();
    }
}