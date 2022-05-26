package lab_03;

public class TwoSortedArrayMerge {

    public static void main(String[] args) {
        int[] sortedArrayNum1 = {1, 12, 16, 28, 34};
        int[] sortedArrayNum2 = {1, 13, 16, 27, 99};
        int[] newSortedArrayNum = new int[sortedArrayNum1.length + sortedArrayNum2.length];
        int temp = 0;
        boolean isMinValue = false;

        // dua gia tri tu array 1 vào newarray
        for (int indexArrayNum1 = 0; indexArrayNum1 < sortedArrayNum1.length; indexArrayNum1++) {
            newSortedArrayNum[indexArrayNum1] = sortedArrayNum1[indexArrayNum1];
        }

        //chay vong lap gia tri cua array2
        for (int indexArrayNum2 = 0; indexArrayNum2 < sortedArrayNum2.length; indexArrayNum2++) {
            isMinValue = false;
            //chay vong lap gia tri cua new array de so sanh vơi gia tri array2
            for (int indexNewArray = 0; indexNewArray < newSortedArrayNum.length; indexNewArray++) {
                if (sortedArrayNum2[indexArrayNum2] < newSortedArrayNum[indexNewArray]) {
                    isMinValue = true;
                    int j = 1;
                    //thay dổi gia tri cua tung element
                    for (int k = 0 + indexNewArray; k < newSortedArrayNum.length; k++) {
                        if(j != newSortedArrayNum.length) {
                            temp = newSortedArrayNum[newSortedArrayNum.length - 1 - j];
                            newSortedArrayNum[newSortedArrayNum.length - j] = temp;
                            j++;
                        }
                    }
                    newSortedArrayNum[indexNewArray] = sortedArrayNum2[indexArrayNum2];
                    break;
                }
            }
            if (isMinValue == false) {
                for (int i = 0; i < newSortedArrayNum.length; i++) {
                    if (newSortedArrayNum[i] == 0) {
                        newSortedArrayNum[i] = sortedArrayNum2[indexArrayNum2];
                        break;
                    }
                }
            }
        }
        System.out.print("Value: ");
        for (int numValue : newSortedArrayNum) {
            System.out.print(numValue + ", ");
        }

    }
}
