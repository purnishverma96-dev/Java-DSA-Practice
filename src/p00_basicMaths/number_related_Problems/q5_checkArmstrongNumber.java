package p00_basicMaths.number_related_Problems;

/*
1. Problem Statement
Given an integer n, check whether it is an Armstrong number or not.
A number is called an Armstrong number if the sum of each digit raised to the power of the total number of digits is equal to the original number.
Example 1:
Input: 153
Total digits = 3
1³ + 5³ + 3³
= 1 + 125 + 27
= 153
Output: true
Therefore, 153 is an Armstrong number.
Example 2:
Input: 123
Total digits = 3
1³ + 2³ + 3³
= 1 + 8 + 27
= 36
36 != 123
Output: false
Therefore, 123 is not an Armstrong number.
 */
public class q5_checkArmstrongNumber {
    public static void main(String[] args) {
        //check Armstrong num
        System.out.println(checkArmstrongNum(153)); // true;
        System.out.println(checkArmstrongNum(10)); // false
        System.out.println(checkArmstrongNum(370));// true;
    }
    static boolean checkArmstrongNum(int num){
        int tempNum1 = num;
        int tempNum2 = num;
        // step 1 count the digit
        int countDigit = 0;
        while (tempNum1!=0){
            tempNum1= tempNum1/10;
            countDigit++;
        }
        // step2 find each last digit and take it's power  with countDigit and sum the value
        int armStrongNum =0;
        while (tempNum2!=0){
            //find lastDigit
            int lastDig = tempNum2%10;
            armStrongNum = armStrongNum + (int)Math.pow(lastDig , countDigit);
            tempNum2 = tempNum2/10;
        }
        if(armStrongNum == num){
            return true;
        }else {
            return false;
        }
    }
}
