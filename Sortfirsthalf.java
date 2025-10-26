// Given an array arr of even size, sort the first half of the array in ascending order and the second half in descending order.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Sortfisthalf{
    public static int[] sorting(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int mid = left + (right-left+1)/2;
        int[] aes = new int[nums.length/2];
        int a = 0;
        Integer[] des = new Integer[nums.length/2];
        int d = 0;
        for(int i = 0;i<mid;i++){
            aes[a] = nums[i];
            a++;
        }
        for(int j = mid;j<nums.length;j++){
            des[d] = nums[j];
            d++;
        }
        Arrays.sort(aes);
        Arrays.sort(des,Collections.reverseOrder());
        for(int i = 0;i<aes.length;i++){
            nums[left] = aes[i];
            left++;
        }
        for(int j = 0;j<des.length;j++){
            nums[left] = des[j];
            left++;
        }
        return nums;
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
        int[] result = sorting(nums);
        System.out.println(Arrays.toString(nums));
    }
}