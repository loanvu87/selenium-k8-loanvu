package lab_02;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int yourNum = scanner.nextInt();

        boolean isOddNum = yourNum % 2 != 0;
        String msg = isOddNum ? "Your number is Odd Number" : "Your number is Even number";
        System.out.println(msg);
    }
}
