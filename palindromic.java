import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class palindromic{
    public static boolean palindrome(int[] nums){
        for(int i = 0;i<nums.length;i++){
            int rem;
            int reverse = 0;
            int original = nums[i];
            int num = nums[i];
            while(num>0){
                rem = num%10;
                reverse = (reverse*10)+rem;
                num = num/10;
            }
            if(original!=reverse){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println(palindrome(nums));
    }
}