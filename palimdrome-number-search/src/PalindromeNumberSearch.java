import java.util.Scanner;
/*Palindrome number search using only mathematical operations. No strings used*/

public class PalindromeNumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two digit number here: ");      /*Get input number from user*/
        int input = scanner.nextInt();
        boolean condition = isPalindrome(input);                /*Call is palindrome method to find out is palindrome or not*/
        System.out.printf("Is %s palindrome? = %s",input,condition);    /*Final output*/
    }

    public static boolean isPalindrome(int num) {
        var numArray1=new int[0];
        int i=0;
        while (num != 0) {                                  /*break while loop when number =0*/
            var numArray2 = new int[numArray1.length + 1];
            for (int j = 0; j < numArray1.length; j++) {
                numArray2[j] = numArray1[j];                    /*Dynamic array creation for store element numbers in inputted number*/
            }
            numArray2[numArray2.length-1]=num%10;           /*Store remainder of number after deviding by 10*/
            numArray1 = numArray2;
            num=num/10;
        }
        var reverseArray = revereseArray(numArray1);                /*Call reverse array method*/
        var isSame = isSame(reverseArray, numArray1);           /*Call is same method*/
        return isSame;
    }

    public static int[] revereseArray(int[] number) {
        int temp=0;
        var reverseArray = new int[number.length];
        for (int i = 0; i < reverseArray.length; i++) {         /*Creat new array which has same length as number and reverse it*/
            reverseArray[i] = number[reverseArray.length - 1 - i];
        }
        return reverseArray;
    }

    public static boolean isSame(int[] revereseArray,int[]numberArray) {
        boolean condition=true;
        for (int i = 0; i < revereseArray.length; i++) {            /*Check the element similarity between reversed array and number array*/
            if (revereseArray[i] != numberArray[i]) {
                condition=false;
                break;
            }
        }
        return condition;
    }
}
