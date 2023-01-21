import java.util.Arrays;

public class SelectionSort
{

    public static void main(String[] args) {
        /*New number array to be sorted. Can edit array to any length*/
        var numbArray = new int[]{12, 23, 44, 5, 22, 3, 4, -45, 34,-89999};
        int[] sortedArray=selectionSortUsingMax(numbArray); //Can call any function

        System.out.println(Arrays.toString(sortedArray));
    }



    /*Selection sort using minimum number*/
    public static int[] selectionSortUsingMin(int[] numbArray) {
        /*Used for loop to run the outer iterations*/
        for (int i = 0; i < numbArray.length; i++) {
            var minNumber = numbArray[i];
            var minIndex = i;
            /*this for loop used to find the local minimum number*/
            for (int j = i; j < numbArray.length; j++) {
                if (numbArray[j] < minNumber) {
                    minNumber = numbArray[j];
                    minIndex = j;
                }
            }
            int tempNumber = numbArray[i];  /*Swapping selected numbers*/
            numbArray[i] = minNumber;
            numbArray[minIndex] = tempNumber;
        }

        return numbArray;                   //return sorted array
    }

    /*Selection sort using maximum number*/
    public static int[] selectionSortUsingMax(int[] numbArray) {

        for (int i = numbArray.length-1; i >=0; i--) {      //outer loop
            int maxNum = numbArray[i];
            int maxIndex = i;
            for (int j = 0; j < i+1; j++) {             //inner loop to find local maximum number
                if (maxNum < numbArray[j]) {
                    maxNum = numbArray[j];
                    maxIndex = j;
                }

            }
            int tempNum = numbArray[i];             //swap numbers
            numbArray[i]=maxNum;
            numbArray[maxIndex] = tempNum;

        }

        return numbArray;                   //return sorted array
    }



}
