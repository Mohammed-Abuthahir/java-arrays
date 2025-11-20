import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MaxOddSum{
    public static int maxsum(int[] nums){
        int sum = 0;
        int minOdd = Integer.MAX_VALUE;
        boolean oddexist = false;
        for(int num : nums){
            if(num > 0){
                sum = sum + num;
            }
            if(num % 2 != 0){
                oddexist = true;
                minOdd = Math.min(minOdd,Math.abs(num));
            }
        }
        if(!oddexist){
            return -1;
        }
        if(sum % 2 == 0){
            sum = sum - minOdd;
        }
        return sum;
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
        int result = maxsum(nums);
        System.out.println("Maximum Odd Sum :"+result);
    }
}
