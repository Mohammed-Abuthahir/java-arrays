// Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the smallest and the second element is the largest, the third element is the second smallest and the fourth element is the second largest, and so on.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Rearrangingarray{
    public static ArrayList<Integer> rearrage(int[] nums){
        Arrays.sort(nums);
        ArrayList<Integer>list = new ArrayList<>();
        int left = 0,right=nums.length-1;
        while(left<right){
            list.add(nums[left]);
            list.add(nums[right]);
            left++;
            right--;
        }
        if(nums.length%2!=0){
            list.add(nums[nums.length/2]);
        }
        return list;
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
        ArrayList<Integer> result = rearrage(nums);
        System.out.println("After Rearranging array :"+result);
    }
}