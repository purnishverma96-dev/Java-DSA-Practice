package p01_array.Medium;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

// array left rotation
/*
example : 1,2,3,4,5,6     after left rotation : 2,3,4,5,6,1
example : {3,4,5,6,3,4} after left rotation by one place : {4,5,6,3,4,3}
 */
public class leftRotateArrayByOnePlace {
    public static void main(String[] args) {

        // BRUTE APPROACH
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k =4;
        leftRotateBrute(arr,k);
    }
    // left rotate the array by one place
    // BRUTE APPROACH
    static void leftRotateBrute(int arr[] , int k){
        int n = arr.length;
        int rotationVal = k%n; // this is very importation to avoid repetitions
        int temp[] = new int[n];
        int counter =0;
        for(int i=k; i<n; i++){
            temp[counter] = arr[i];
            counter++;
        }
        for(int j=0; j<k; j++){
            temp[counter]=arr[j];
            counter++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
