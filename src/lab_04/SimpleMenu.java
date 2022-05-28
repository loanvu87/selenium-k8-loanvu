package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu {

    public static void main(String[] args) {
        boolean isContinue = true;
        List<Integer> arrayListNumber = new ArrayList<>();
        arrayListNumber = generateNumbers();
        do {
            printMenu();
            int userInput = getUserInput();
            switch (userInput) {
                case 1:
                    printAllNumbers(arrayListNumber);
                    break;
                case 2:
                    getMaxValue(arrayListNumber);
                    break;
                case 3:
                    getMinValue(arrayListNumber);
                    break;
                case 4:
                    searchNumber(arrayListNumber);
                    break;
                case 5:
                    isContinue = false;
                    System.out.println("See you again!!!");
                    break;
                default:
                    System.out.println("Please input value from 1 to 5!");
                    break;
            }
        } while (isContinue);
    }

    private static List generateNumbers() {
        System.out.print("Please input the num of numbers you want to generate: ");
        Scanner scanner = new Scanner(System.in);
        int numOfNumbers = scanner.nextInt();
        List<Integer> arrayListNumber = new ArrayList<>();
        for (int index = 0; index < numOfNumbers; index++) {
            int randomNumber = new SecureRandom().nextInt(1000);
            arrayListNumber.add(randomNumber);
        }
        System.out.printf("We added list of %d random numbers!\n", numOfNumbers);
        return arrayListNumber;
    }

    private static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
    }

    private static int getUserInput() {
        System.out.print("Please input your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printAllNumbers(List<Integer> arrayListNumbers) {
        System.out.print("All number is: ");
        for (int number : arrayListNumbers) {
            System.out.printf("%d, ", number);
        }
        System.out.println(" \n");
    }

    private static void getMaxValue(List<Integer> arrayListNumbers) {
        int maxValue = arrayListNumbers.get(0);
        for (int index = 1; index < arrayListNumbers.size(); index++) {
            if (arrayListNumbers.get(index) > maxValue) {
                maxValue = arrayListNumbers.get(index);
            }
        }
        System.out.printf("Max Value is %d \n\n", maxValue);
    }

    private static void getMinValue(List<Integer> arrayListNumbers) {
        int minValue = arrayListNumbers.get(0);
        for (int index = 1; index < arrayListNumbers.size(); index++) {
            if (arrayListNumbers.get(index) < minValue) {
                minValue = arrayListNumbers.get(index);
            }
        }
        System.out.printf("Min Value is %d \n\n", minValue);
    }

    private static void searchNumber(List<Integer> arrayListNumber) {
        System.out.print("Which number you want to search: ");
        boolean exitsSearchNum = false;
        Scanner scanner = new Scanner(System.in);
        int searchNum = scanner.nextInt();
        for (int index = 0; index < arrayListNumber.size(); index++) {
            if (arrayListNumber.get(index) == searchNum) {
                exitsSearchNum = true;
                System.out.printf("%d is at index %d.\n\n", searchNum, index);
                break;
            }
        }
        if (exitsSearchNum == false) {
            System.out.println("Your numbers does not exist!\n");
        }
    }
}
