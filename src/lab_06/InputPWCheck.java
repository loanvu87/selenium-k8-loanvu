package lab_06;

import java.util.Scanner;

public class InputPWCheck {

    public static void main(String[] args) {
        String correctPW = "password123";
        String inputPW = "";
        int inputTimes = 1;
        final int MAX_INPUT_TIMES = 3;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please input your password:");
            inputPW = scanner.next();
            if (inputPW.equals(correctPW)) {
                System.out.println("You inputted a correct password.");
                break;
            } else if (!inputPW.equals(correctPW) && inputTimes != 3) {
                System.out.println("Incorrect password! Please input again.");
                System.out.printf("You have %d times more to input the password.\n", MAX_INPUT_TIMES - inputTimes);
                inputTimes++;
            } else {
                System.out.println("You inputted the incorrect 3 times.See you again.");
                inputTimes++;
            }
        } while (inputTimes < (MAX_INPUT_TIMES + 1));

    }
}
