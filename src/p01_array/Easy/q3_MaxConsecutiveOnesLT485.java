package p01_array.Easy;
// LeetCode 485 question
public class q3_MaxConsecutiveOnesLT485 {
    public static void main(String[] args) {
    // apply testcase
        int arr1[] = {1,1,1,0,0,0,1,1,0,1,1,0};
        System.out.println(maxConsecutiveOnes(arr1)); // 3

        int arr2[] ={0,0,0,1,1,1,1,1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(arr2)); // 6

        int arr3[] = {0,0,0,1,1,1,0,1,1,1,1,1,1,1};
        System.out.println(maxConsecutiveOnes(arr3)); //7
    }
    // find maximum consecutive ones
    // time complexity O(n)
    static  int maxConsecutiveOnes(int[] nums){
        int n = nums.length;
        int oneCounter =0;
        int counter =0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                counter++;
            } else if (nums[i]==0) {
                if(counter>oneCounter){
                    oneCounter = counter;
                }
                counter=0;
            }
        }
        // handle one test case :think if all right side of array was 1 or entire array was 1 , then in this case
        // the else if(nums[i]==0) will not be run and that case the counter might be go beyond oneCounter
        if(counter > oneCounter){
            return counter;
        }
        return oneCounter;
    }
}
