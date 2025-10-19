// You are given a sorted array arr[] that may contain duplicate elements. Your task is to find the index of the last occurrence of any duplicate element and return the index along with the value of that element. If no duplicate element is found, return [-1, -1].

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class lastduplicate{
    public static int[] duplicate(int[] nums){
        int left = nums.length-2;
        for(int right = nums.length-1;right>0;right--){
            if(nums[left]==nums[right]){
                return new int[]{right,nums[right]};
            }
            else{
                left--;
            }
        }
        return new int[]{-1,-1};
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
        int result[] = duplicate(nums);
        System.out.println("Result :"+Arrays.toString(result));
    }
}