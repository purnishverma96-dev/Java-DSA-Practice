package p00_basicMaths.number_related_Problems;
// you will be given a number you have to return it's reverse
// eg : 4356345 , op : 5436534
// eg: 123456000 , 000654321 or 654321

public class q3_reverse_a_number {
    public static void main(String[] args) {
        //1. reversing a number
        System.out.println(reverseNum(1234000)); //4321
        System.out.println(reverseNum(46460098)); // 89006464


    }
    //reverse number
    static int reverseNum(int n){
        int reverse  =0;
        while (n!=0){
            int lastDig = n%10;
            //reversing formula
            reverse = reverse*10 +lastDig;
            n = n/10;
        }
        return reverse;
    }
}
