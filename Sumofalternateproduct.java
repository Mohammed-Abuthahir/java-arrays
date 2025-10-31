// Given an array arr of even size consisting of positive integers. After sorting the array, find the sum of the product of i-th element from starting and i-th element from last.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Sumofalternateproduct{
    public static int sumofproduct(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            sum = sum + (nums[left]*nums[right]);
            left++;
            right--;
        }
        return sum;
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
        int result = sumofproduct(nums);
        System.out.println("Result is :"+result);
    }
}