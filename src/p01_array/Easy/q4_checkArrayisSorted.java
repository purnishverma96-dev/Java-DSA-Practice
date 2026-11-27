package p01_array.Easy;
/*
you will be given an array in increasing order , you have to check it , is it sorted or not
 */
public class q4_checkArrayisSorted {
    public static void main(String[] args) {
        // using two pointer
        int arr[] = {4,5,6,7,8,8,8};
        System.out.println(checkSorted(arr)); // true;
        System.out.println(checkSortUsingSINGLEPOINTER(arr)); // true
        int arr1[] = {1,1,1,1,1,1,1};
        System.out.println(checkSorted(arr1)); // true;
        System.out.println(checkSortUsingSINGLEPOINTER(arr1)); // true
    }
    // using two pointer
    // time complexity is O(n) and space is O(1)
    static boolean checkSorted(int arr[]){
        int n = arr.length;
        int i =0;
        int j =1;
        while (i<n){
//      if(arr[i]<arr[j+1]) // this will give array index out of bound if you initialize
            // j =0 outside the loop ,
            if(j==n){
                return true;
            }
            if(arr[i]<=arr[j]){
                i++;
                j++;
            }else{
                return false;
            }
        }
        return true;
    }
    // using single pointer
    static boolean checkSortUsingSINGLEPOINTER(int arr[]){
        int n=arr.length;
        int i =0;
        // here if array contains only one value so int this case while loop will not
        // run and the return of this function is true; it will throw true value
        while (i<n-1){
            if(arr[i]<=arr[i+1]){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }
}
