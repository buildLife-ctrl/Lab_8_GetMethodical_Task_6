import java.util.Scanner;

public class InputHelper {
    public static void prettyHeader(Scanner scan, String msg) {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.print("***");
                for (int z = 0; z < 54; z++) {
                    System.out.print(" ");
                    System.out.print(msg);
                }
                System.out.print("***");
            } else {
                for (int j = 0; j < 60; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String input;
        boolean check = false;

        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.length() != 0) {
                check = true;
            } else {
                System.out.println("You have to enter something, try again.");
            }
        } while (!check);

        return input;
    }
}
