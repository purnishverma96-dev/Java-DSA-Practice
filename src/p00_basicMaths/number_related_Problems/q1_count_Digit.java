package p00_basicMaths.number_related_Problems;
// you will be give n number you have to count digits of the number
//eg : 4563443, total digits 7
// eg : 434300 , total digits 6
public class q1_count_Digit {
    public static void main(String[] args) {
        // prob 1.
        System.out.println(countDigit(464356));
        System.out.println(countDigit(1000)); // 4

    }
    // solution
    static int countDigit(int num){
        int counter = 0;
        if(num==0){
            return 0;
        }
        while (num!=0){
            num = num/10;
           counter++;
        }
        return counter;
    }
}
