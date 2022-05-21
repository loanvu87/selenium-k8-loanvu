package lab_02;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double bmiNormalWeightMin = 18.5;
        final double bmiNormalWeightMax = 24.9;

        System.out.print("Please input your height(m): ");
        double yourHeight = scanner.nextFloat();

        System.out.print("Please input your weight(kg): ");
        double yourWeight = scanner.nextFloat();

        double normalWeightMin = bmiNormalWeightMin*(yourHeight*yourHeight);
        double normalWeightMax = bmiNormalWeightMax*(yourHeight*yourHeight);

        double bmi = yourWeight / (yourHeight * yourHeight);

        if (bmi < 18.5) {
            System.out.println("You are underweight!");
            System.out.println("You should increase your weight: " + (normalWeightMin - yourWeight));
        } else if (bmi < 25) {
            System.out.println("You are normal weight!");
        } else if (bmi < 30) {
            System.out.println("You are overweight!");
            System.out.println("You should decrease your weight: " + (yourWeight - normalWeightMax));
        }else{
            System.out.println("You are obesity!");
            System.out.println("You should decrease your weight: " + (yourWeight - normalWeightMax));
        }
    }
}
