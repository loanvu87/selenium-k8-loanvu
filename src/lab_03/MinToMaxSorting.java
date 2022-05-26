package lab_03;

public class MinToMaxSorting {
    public static void main(String[] args) {
        int[] arrayNum = {12, 34, 1, 16, 28};
        int i = 0;
        int tempNum = 0;

        while (i < arrayNum.length) {
            for (int index = 0 + i; index < arrayNum.length; index++) {
                if (arrayNum[index] < arrayNum[i]) {
                    tempNum = arrayNum[i];
                    arrayNum[i] = arrayNum[index];
                    arrayNum[index] = tempNum;
                }
            }
            i++;
        }

        System.out.print("Value from min to max: ");
        for (int numValue : arrayNum) {
            System.out.print(numValue + ", ");
        }
    }
}
