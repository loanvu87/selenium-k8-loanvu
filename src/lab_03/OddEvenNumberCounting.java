package lab_03;
public class OddEvenNumberCounting {
    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 3, 4, 5};
        int evenNum = 0;

        for (int number : arrayNum) {
            if (number % 2 == 0) {
                evenNum++;
            }
        }

        System.out.printf("Even Numbers: %d\n", evenNum);
        System.out.printf("Odd Numbers: %d\n", arrayNum.length - evenNum);
    }
}
