package lab_03;

public class MinMaxValueFinding {
    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 3, 4, 5};
        int minValue = arrayNum[0];
        int maxValue = arrayNum[0];

        for (int index = 1; index < arrayNum.length; index++) {
            if (arrayNum[index] < minValue) {
                minValue = arrayNum[index];
            }
            if (arrayNum[index] > maxValue) {
                maxValue = arrayNum[index];
            }
        }

        System.out.printf("Minimum value is: %d\n", minValue);
        System.out.printf("Maximum value is: %d\n", maxValue);
    }
}
