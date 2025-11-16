import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class PerfectArray{
    public static boolean perfectarray(int[] nums){
        int left = 0;
        int right = nums.length;
        int mid = (left+right)/2;
        boolean ishave = false;
        for(int i = 1;i<mid;i++){
            if(nums[0]!=nums[1]){
                if(nums[i-1]<=nums[i]){
                    ishave = true;
                }
                else{
                    return false;
                }
            }
        }
        if(ishave){
            if(nums[mid]!=nums[mid+1]){
                for(int i = mid;i<nums.length;i++){
                if(nums[i]>=nums[i+1]){
                   return true;
                  }
               }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = perfectarray(nums);
        System.out.println("Result :"+result);
    }
}