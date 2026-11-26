package p01_array.HashMap;

import java.util.HashMap;

/*
You are given an integer array arr[],return the element which occurs
 maximum times. If multiple such elements exists return the maximum element.
Example:
Input: arr[] = [1, 2, 2, 2, 4, 1]
Output: 2
Explanation: 2 is most frequent element of this array with 3 occurrences.
Input: arr[] = [1, -5, 8, 1]
Output: 1
Explanation: 1 is most frequent element of this array with 2 occurrences.
Input: arr[] = [3, 0, 0, 3, 8]
Output: 3
Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.
 */
public class Q2_most_frequent_in_array {
    public static void main(String[] args) {
        // my thinking
        int arr[] ={0,0,1,1,1,5,-5,-5,-5,-5,-5};
        System.out.println(mostFreqEle(arr));
    }
    // my thinking
    static int mostFreqEle(int num[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        // find frequency
        for(int n :num){
            map.put(n,map.getOrDefault(n, 0)+1);
        }
        //find the highest frequency value of element
        int maxVal = 0;
        for(int value : map.values()){
            if(value>maxVal){
                maxVal = value;
            }
        }
        // find the maximum value in array who has the highest frequency with the largest Number
        int largest = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) == maxVal){
                if(key>largest){
                    largest = key;
                }
            }
        }
        return largest;
    }
}
