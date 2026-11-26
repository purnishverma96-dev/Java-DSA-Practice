package p00_basicMaths.number_related_Problems;
/*
palindrome No : a number  is called palindrome. if the reverse of a number is same as the given number
example: 1331 , it's revere will be 1331 , similarly 121 ,  and it's reverse is 121

 */
public class q4_checkPalindrome {
    public static void main(String[] args) {
        // check palindrome
        System.out.println(checkPalindrome(1221)); // true
        System.out.println(checkPalindrome(133432));
    }
    static boolean checkPalindrome(int num){
        int temp  = num;
        // just find it's reverse , and check this reversed value with original value
        // if both same then this number is palindrome
        int reverse = 0;
        while (temp!=0){
            // find last digit
            int lastDig = temp%10;
            reverse = reverse*10 + lastDig;
            temp = temp/10;
        }
        if(reverse == num){
            return true;
        }
        return false;
    }
}
