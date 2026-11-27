package p01_array.Easy;

public class q2_secondLargestElement {
    public static void main(String[] args) {
        // test cases
        int arr[] = {3,3,3,3,3}; // -1
        int arr1[] = {10,5,5,5,12,0,8}; // 10
        System.out.println(secondLargest(arr1));
    }
    //find the second-largest element from the array
    // tc : o(n) , space o(1)
    static int secondLargest(int num[]){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i =0; i<num.length; i++){
            if(num[i]>largest){
                secLargest = largest;
                largest = num[i];
            }else if(num[i] > secLargest && num[i] < largest){
                secLargest = num[i];
            }
        }
        if(secLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secLargest;
    }
}
