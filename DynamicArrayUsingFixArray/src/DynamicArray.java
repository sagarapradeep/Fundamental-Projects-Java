import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        String[] array1 = new String[0];            //creation of initial array of length 0
        var scanner = new Scanner(System.in);
        while (true) {                                  //into while outer loop for continuos input
            System.out.print("Enter number here(Q/q to quiet): ");      //input message
            String input = scanner.nextLine().trim();
            if ("q".equals(input) || "Q".equals(input)) {           //loop stops when input=Q or q
                break;
            } else {
                var newStrArray = new String[array1.length + 1];        //creating new array which has variable length
                for (int i = 0; i < array1.length; i++) {           //copy all the members of previous array to new array
                    newStrArray[i] = array1[i];
                }
                newStrArray[newStrArray.length - 1] = input;        //add recent input as new array's last member
                array1 = newStrArray;                                //assign new arrays memory address to previous array

            }
        }
        System.out.println(Arrays.toString(array1));            //final output array which contain all the inputted members in array form
    }
}


