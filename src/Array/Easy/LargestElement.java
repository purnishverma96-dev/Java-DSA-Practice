package Array.Easy;

import java.util.Arrays;

public class LargestElement {



    public static void main(String[] args) {
        int[] arr = {3,5,2,-5,-3,1,3,6};
        int[] arr1 = {1,1,1,1,1};

        //brute
        int x = brute(arr);
        System.out.println(x);

        // better
        int y = best(arr1);
        System.out.println(y);

    }
    // brute force approach
    // just sort the array and take it last element
    // complexity : time - o(long n) , space - O(1)
    static int brute(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }

    //better approach
    static int best(int arr[]){
        int n = arr.length;
        int largest = arr[0];
        for(int i =0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
