import java.util.Arrays;

/*Insertion sort*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbArray = new int[]{12, 3, 4, 1, 33, 7867, -66, -9868, 345, 0, -66, 456, 345};

        int[] sortedArray = insertionSort(numbArray);
        System.out.println(Arrays.toString(sortedArray));       //calling method to insertion sort

    }

    public static int[] insertionSort(int[] numbArray) {
        for (int i = 1; i < numbArray.length; i++) {            //outer loop to run iterations
            int tempNumber=0;
            int tempIndex=0;
            if (numbArray[i-1] > numbArray[i]) {
                tempNumber = numbArray[i];              //select each number
                tempIndex = 0;
                for (int j = 0; j < i; j++) {                   //swap
                    if (numbArray[j] >= tempNumber) {
                        tempIndex=j;
                        for (int k = i ; k >j ; k--) {          //this loop to push the numbers toward
                            numbArray[k] = numbArray[k-1];
                        }
                        break;
                    }
                }
                numbArray[tempIndex]=tempNumber;
            }
        }

        return numbArray;           //return sorted array
    }




}
