package p01_array.HashMap;
// you will be given an array you have to find its frequency of elements

import java.util.HashMap;

public class Q1_findFrequencyOfElements {
    public static void main(String[] args) {
        int arr[] = {2,4,5,4,5,5,3,3,5,6,7,8,4,8};
        int arr1[] = {1,2,3,3,4,4,6};
        frequency(arr);
    }
    // find frequency
    static  void frequency(int arr[]){
        // create a hashmap and put all values of arrays as a key and frequency as a value
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq);
    }
}
