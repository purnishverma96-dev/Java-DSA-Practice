package p00_basicMaths.number_related_Problems;
// given a number , find its sum of all digits
//eg : 3453200 -> 3+4+5+3+2+0+0 = 17

public class q2_sumOfDigitsOfNumber {
    public static void main(String[] args) {
        // sum of digits
        System.out.println(sumOfDigits(46400643));
        System.out.println(sumOfDigits(4390012)); // 19

    }
    // sum of digits
    static int sumOfDigits(int n){
        int sum =0;
        while (n!=0){
            // find last digit
            int lastDig = n%10;
            sum +=lastDig;
            n = n/10; // reducing the original number so that at 0 it can terminate the while loop
        }
        return sum;
    }
}
