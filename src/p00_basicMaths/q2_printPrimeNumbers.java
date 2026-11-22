package p00_basicMaths;
//  GIVEN A NUMBER OF N , PRINT ALL PRIMS TILL N
// covers , brute approach , algorithm Sieve of Eratosthenes for optimized solution

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class q2_printPrimeNumbers {
    // print prime numbers from 2 to 100 , the below is my thinking--very lower thinks
    //BRUTE : check number is prime or not then print;
    // time complexity : nx(Rootn)--very bigger complexity
    static void print_prime(int n){
        int primeCounter = 0;
        for(int i =2 ; i<=n; i++){
            if(check_print_prime(i)){
                primeCounter++;
                System.out.print(+i+" ");
            }
        }
        System.out.println();
        System.out.println("total prime Numbers till "+n+ " is : " +primeCounter);
    }
    static boolean check_print_prime(int n){
        int primeCount = 0;
        for(int i =2 ; i*i<=n; i++){
            if(n%i ==0){
                primeCount++;
                break;
            }
        }
        if(primeCount==0){
            return true;
        }else {
            return false;
        }

    }
    /*
    //ANOTHER WAY OF  WRITE ABOVE PROGRAM---AGAIN IT'S BRUTE SOLUTION-TC N X ROOT(N)
    check if num is prime or not , once you figure out then print
     */
    static void printPrime_another_brute(int n){
        int totalPrime = 0;
        for(int i=2; i<=n; i++){
            int primeCount =0; // primeCount is trigger to check num is prime or not , so write inside the outer loop
            //  it is checking for every i , whether it is prime or not
            for(int j =2 ; j*j<=i;j++){
                if(i%j==0){
                    primeCount++;
                    break;
                }
            }
            // if it is prime , you can count or print whatever you want to do
            if(primeCount==0){
                System.out.print(+i+" ");
                totalPrime++;
            }
        }
        System.out.println();
        System.out.println("total prime numbers till " +n+ " is : " +totalPrime);

    }
    /*
    MOST OPTIMISE SOLUTION : Sieve of Eratosthenes
    for printing primes , take an array prime[], with size n+1 and put everything 1
    , now check for every number of input number n , //LOGIC EXPLAINED BELOW
    if 2 is prime then , multiples of 2 will be not a prime so , make them 0
    if 3 is prime then , multiples of 3 like 6,12,18... will not be prime
    if 5 is prime then it's multiple will not be prime
    similarly it's clear if x is prime number then it's multiples will not be prime
    // so initially take a prime array and put 1 inside it , and find its multiples number and put them to 0
    // lastly traverse the array and find it's all primes value
      */
    static void sieve_of_Eratosthenes(int number){
        int[] prime = new int[number+1]; // for ignoring 0 and 1 th indexes so , we have to take number+1 size
        for(int i = 2 ;i<prime.length; i++){
            prime[i]= 1;
        } // TC :O(n)
        // BELOW IS MAIN SIEVE LOGIC
        for(int i = 2 ; i<=number ; i++){
            if(prime[i]==1){
                // assign the multiples of ith index is 0  , inside the prime array
                for(int j = 2*i; j<=number ; j =  j+i){
                     prime[j] =0;
                }
            }
        } //TIME COMPLEXITY : N(LOG(LOG N))
        for(int i =2 ; i<prime.length; i++){
            if(prime[i]==1){
                System.out.print(" "+i);
            }
        } // O(n)
        //TOTAL TC IS : 	O(n log log n) , SPACE COMPLEXITY : O(n)
    }

    public static void main(String[] args) {
        //BRUTE SOLUTION
        System.out.println("=========================brute solution=========================");
        //  print_prime(100);

        // another brute-similar to above , but different way of writing
        System.out.println("=========================another brute solution=========================");
        //  printPrime_another_brute(100);
        printPrime_another_brute(50);

        // algorithm Sieve of Eratosthenes for optimized solution
        System.out.println("===========================sieve algo================");
    //    sieve_of_Eratosthenes(10);
        sieve_of_Eratosthenes(100);

    }
}
