// Input: arr[] = [4, 1, 5]
// Output: 8
// Explanation: The sum of absolute differences with closest neighbors is |4-1| + |1-5| + |5-4| = 8.

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Friendlyarray{
    public static int array(int[] nums){
        int sum = 0;
        int left = 0;
        for(int right = 1;right<nums.length;right++){
            sum = sum + Math.abs(nums[left]-nums[right]);
            left++;
        }
        sum = sum +  Math.abs(nums[0]-nums[nums.length-1]);
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = array(nums);
        System.out.println("Result :"+result);
    }
}
