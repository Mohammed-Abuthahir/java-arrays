// Given an array arr of distinct numbers. Find the length of the shortest unordered (neither increasing nor decreasing) subarray in the given array. If there is no subarray then return 0.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Shortestunorderedsubarray{
    public static int subarray(int[] nums){
        int[] index = new int[nums.length];
        int j = 0;
        for(int num : nums){
            index[j] = num;
            j++;
        }
        Arrays.sort(index);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=index[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = subarray(nums);
        System.out.println("Result :"+result);
    }
}