package p01_array.Easy;
// LeetCode 26
// array will be given combinations of duplicates (in non-decreasing order), just identify all uniqe elements
// and return unique value : you have to do it in-place way
public class q5_removeDuplicatesFromSortedArrLC26 {
    public static void main(String[] args) {
        // using while loop
        int arr[] ={1,1,1,0,0,0,4,4,3,3,2,5,9,10,10,10,10,10};
        System.out.println(removeDup(arr)); // 8
    }
    //remove duplicates// using while loop
    // tc is : O(n)
    static int removeDup(int arr[]){
        int n= arr.length;
        int i=0;
        int index =0;
        while (i<n){
            if(i==n-1){
                arr[index] = arr[i];
                index++;
                return index;
            }
            if(arr[i]!=arr[i+1]){
                arr[index] = arr[i];
                index++;
                i++;
            }else {
                i++;
            }
        }
        return index;
    }

}
