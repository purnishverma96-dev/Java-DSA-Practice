package p00_basicMaths;

/*
// you will be given a number you have to check it is prime or not
// A number divisible by one itself and only 1 , called prime number
// another definition : a number which has only two no of divisor called prime number
 -> only 1 and number itself
 // another definition if number divides 2 or after 2 then it is not prime , except 1 and number itself
 -> useful for optimize solution
 // REMEMBER : 1 IS NOT A PRIME NO
eg: 2,3,11,17,23

 */
public class q1_isANumberPrimeOrNot {
    public static void main(String[] args) {
        // BRUTE APPROACH
        System.out.println("====================brute solution=================================");
       isPrime(107);// the num is prime
        isPrime(1); // the number is not prime
       isPrime(30); // no is not prime

        // BETTER APPRAOCH
        System.out.println("====================better solution=================================");
        isPrime_better(1);
        isPrime_better(463535);
        isPrime_better(301);

        // most optimized solution
        System.out.println("====================better solution=================================");
      isPrime_optimize(1);
      isPrime_optimize(0);
      isPrime_optimize(401);
      isPrime_optimize(112);
    }
    // brute approach :1 , find all possible divisor and count it , if divisor counting goes beyond 2 that means
    // it is not a prime number
    // Time complexity : O(N)
    static void isPrime(int number){
        // count total divisor of number n
        int n = number;
        int divisorCount = 0;
        for(int i =1; n>=i; i++){
            if(n%i == 0){
                divisorCount++;
            }
        }
        // remember only two divisor must be existed for checking any number prime
        // the below prog will be failed if for input  number 1
//        if(divisorCount >2){
//            System.out.println("the number is not prime");
//        }else {
//            System.out.println("the number is prime");
//        }
        // correct appraoch
        if(divisorCount ==2){
            System.out.println("the number is prime");
        } else{
            System.out.println("the number is not prime");
        }
          /*
    in above code if input is ultra large then  loop will go at the very end
    so time comp : is O(N) ,but it will show TLE(Time Limit Exceeded)
     now can you reduce it's time complexity
     */
    }
    // better solution :
    /*
    first find the divisors on any given numbers
    example 1 : 80
    1x80  or 80*1 -> if you checked for 1 don't need check for 80
    2*40 or 40*2 ->if you checked for 2 don't need check for 40
    4*20 or 20*4  ->if you checked for 4 don't need check for 20
    5*16 or 16*5  ->if you check for 5 don't need check for 16
    8*10 or 10*8  ->if you check for 8 don't need check for 10
    here observe very carefully we don't need to check number after 8 Hnn.. notice we just have to run operation
    8 times that's it . so here  8 is roughly equals = root of 80
    example 2 : 36
    1*36 or 36*1 , if you checked for 1 don't need check for 36
    2*18 or 18*2 , if you checked for 2 don't need to check for 18
    3*12 or 12*3 , if your checked for 3 , don't need to check for 12
    4*9 or 9*4  , if you checked for 4 don't need to check for 9
    6*6 , again it  is the same
    after that we don't need to check after 6 which nearly equals ROOT UNDER 36
    ONE MORE CLUE : we know if any number divides 2 or after 2 then it is not a prime number
    WE DON'T NEED TO RUN LOOP STARTING FROM 1 START FROM 2 AND CHECK FOR TILL ROOT UNDER N.
    IF NUMBER GET DIVIDES 2 OR AFTER 2 THEN IT NOT PRIME
     */
    static void isPrime_better(int num){
        int count = 0;
        for(int i =2 ; i*i <=num; i++){
            // IF NUMBER DIVIDES 2 OR ANY NUMBER FROM AFTER 2 , THEN IT IS OBVIOUSLY NOT PRIME
            if(num % i == 0){
                count++;
            }
        }
        if(count==0){
            System.out.println("the number is prime");
        }else{
            System.out.println("the number is not prime");
        }
    }
    /*
    ABOVE code is quite better , but it can be optimized using break keyword, bcz if in first attemp
    count value got zero , then it surely the number is not a prime
    and also this is not give correct prime for 0 and 1, make sure to also handle them , then it's correct for
    most optimized solution
     */

    // most optimise solution : time complexity : rootN
    static void isPrime_optimize(int number){
        if( number ==0 || number==1){ // by the way 0 ,1 or negative numbers also not a primes , use condition number <=1
            System.out.println("the number is not prime");
            return;
        }
        int primeCount = 0;
        for(int i =2; i*i <=number ; i++){
            if(number % i ==0){
                primeCount++;
                break; // if number divides from 2 or after 2 in first attemp then it is surely not prime ,
            }
        }
        if(primeCount ==0){
            System.out.println("the number is  prime");
        }else {
            System.out.println("the number is not prime");
        }
    }

}
