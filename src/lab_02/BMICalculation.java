package lab_02;

import java.util.Scanner;
public class BMICalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double BMI_NORMAL_WEIGHT_MIN = 18.5;
        final double BMI_NORMAL_WEIGHT_MAX = 24.9;

        System.out.print("Please input your height(m): ");
        double yourHeight = scanner.nextDouble();

        System.out.print("Please input your weight(kg): ");
        double yourWeight = scanner.nextDouble();

        double normalWeightMin = BMI_NORMAL_WEIGHT_MIN * (yourHeight * yourHeight);
        double normalWeightMax = BMI_NORMAL_WEIGHT_MAX * (yourHeight * yourHeight);

        double bmi = yourWeight / (yourHeight * yourHeight);

        if (bmi < 18.5) {
            System.out.println("You are underweight!");
            System.out.println("You should increase your weight: " + (normalWeightMin - yourWeight));
        } else if (bmi < 25) {
            System.out.println("You are normal weight!");
        } else if (bmi < 30) {
            System.out.println("You are overweight!");
            System.out.println("You should decrease your weight: " + (yourWeight - normalWeightMax));
        } else {
            System.out.println("You are obesity!");
            System.out.println("You should decrease your weight: " + (yourWeight - normalWeightMax));
        }
    }
}
