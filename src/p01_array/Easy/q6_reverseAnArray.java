package p01_array.Easy;

import java.util.Arrays;

/*
you will be given an array you have to reverse it
 */
public class q6_reverseAnArray {
    public static void main(String[] args) {
        //reverse using while loop
        System.out.println("==========================reverse using while loop==================");
        int arr[] = {4,5,6,7,8,9};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3};
        reverseArr(arr);
        reverseArr(arr1);
        reverseArr(arr2);

        // reverse using for loop
        System.out.println("===============reverse using for loop====================");
        int nums[] = {10,11,12,13,14,15,16};
        int[] nums1 = {45};
        int[] nums2 = {5,6,7,8};
     reverseArray(nums);
     reverseArray(nums1);
     reverseArray(nums2);

    }
    // reversing using while loop
    static void reverseArr(int nums[]){
        int n = nums.length;
        int end = n-1;
        int start =0;
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] =temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));

    }
    //reverse sing for loop
    static void reverseArray(int[] nums){
        int start = 0;
        int end = nums.length;
        for(int i = start ; i<end-1; i++){
            int temp = nums[i];
            nums[i] = nums[end-1];
            nums[end-1] = temp;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
