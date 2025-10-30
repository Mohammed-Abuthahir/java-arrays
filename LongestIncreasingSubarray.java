import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class LongestIncreasingSubarray{
    public static int subarray(int[] nums){
        int maxlen = 1;
        int currlen = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currlen++;
                maxlen = Math.max(currlen,maxlen);
            }
            else{
                currlen = 1;
            }
        }
        return maxlen;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = subarray(nums);
        System.out.println("Result :"+result);
    }
}