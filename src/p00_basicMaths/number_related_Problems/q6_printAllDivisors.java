package p00_basicMaths.number_related_Problems;

public class q6_printAllDivisors {
    public static void main(String[] args) {
        // BRUTE APPROACH :
        System.out.println("==================brute approach=============================");
        printDivisor(36);

        // better approach
        System.out.println("======================better approach===================");
        printDivisorsBetter(36);

    }
    //print all divisors
    // TIME COMPLEXITY : O(n) , SPACE COMPLEXITY : 0(1)
    static void printDivisor(int num){
        for(int i =1; i<=num; i++){
            if(num%i==0){
                System.out.print(i +" ");
            }
        }
    }

    // print all divisors using better approach
    /*
    for examples 36 it's possible divisors will be :1 2 3 4 6 9 12 18 36
    1x36  , if you print 1 so , printing 36 do : 36/1 or num/i
    2x18 , if you print 2 so , printing 18 do : 36/2 or num/i
    3x12 , if you print 3 so , printing 12 do : 36/3 or num/i
    4x9  if you print 4 so , printing 9 do : 36/4 or num/i
    6x6 if you print 6 so don't need to print 6 again we have to verify ,if((num/i)!= i)
    here observe we just have to run our loop sqroot n times , and other value is just
    looking in the form of num/i
     */
    // TIME COMPLEXITY : O(sqrt n) , space Complexity O(log n)(if you want all value in sorted order)
    static void printDivisorsBetter(int num){
        for(int i =1; i*i<=num; i++){
            if(num%i==0){
                System.out.print(i +" ");
                if((num/i)!=i){ // must carefully same value should not be print doubt times
                    System.out.print((num/i) +" ");
                    // remember the value will not be printed in sorted order
                    // we can take an arrayList or array and put this value inside it and can sort that value
                }
            }
        }
    }

}
