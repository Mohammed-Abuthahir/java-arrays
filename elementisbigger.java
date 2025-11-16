// You are given an array arr[] of integers. Your task is to find the count of elements before which all the elements are smaller. The first element is always counted as there are no elements before it.
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class elementisbigger{
    public static int elementBig(int[] nums){
        int count = 1;
        int updatemaximum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>updatemaximum){
                count++;
                updatemaximum = nums[i];
            }
        }
        return count;
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
        int result = elementBig(nums);
        System.out.println("Elements before which no element is bigger : " +result);
    }
}