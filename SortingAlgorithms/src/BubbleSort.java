import java.util.Arrays;
/*Bubble sort using both dowhile and for loop*/
public class BubbleSort {
    
    public static void main(String[] args) {
        int[] numbArray=new int[]{12,5,4,4,345,45,23}; //int number array can add or delete any number
        var sortedNumArray=bubbleSortUsingDoWhileLoop(numbArray);           //can use any method either do while or for loop
        System.out.println(Arrays.toString(sortedNumArray));            //print sorted array

    }

    public static int[] bubbleSortUsingForLoop(int[] numbArray) {          //bubble sort using for loop
        for (int i = 0; i < numbArray.length; i++) {                    //outer loop to run the iterations
            for (int j = 0; j < numbArray.length-1-i; j++) {            //inner loop to push selected number to the corner(min or max)
                if (numbArray[j] > numbArray[j + 1]) {
                    int temp = numbArray[j+1];                  //pushing selected number
                    numbArray[j+1] = numbArray[j];
                    numbArray[j]=temp;
                }
            }

        }
        return numbArray;                   //return sorted array

    }

    public static int[] bubbleSortUsingDoWhileLoop(int[] numbArray) {           //bubble sort using do while loop
        int i=0;                        //to run the outer loop and to exit from outer do while
        do{
            int j=0;
            do{                                                 //pushing selected number to corner using inner loop
                if (numbArray[j] > numbArray[j + 1]) {
                    int temp = numbArray[j+1];                      //pushing selected number
                    numbArray[j+1] = numbArray[j];
                    numbArray[j]=temp;
                }
                j++;
            }while(j<numbArray.length-1-i);     //inner loop end

            ++i;
        }while(i<numbArray.length-1);           //outer loop end
        return numbArray;               //return sorted array
    }
}
