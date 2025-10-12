import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumsumsubarray{
    public static int maxsubarray(int[] nums,int k){
        int windowsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<k;i++){
            windowsum = windowsum + nums[i];
        }
        for(int i = k ;i<nums.length;i++){
            windowsum = windowsum - nums[i-k] + nums[i];
            maxsum = Math.max(maxsum , windowsum);
        }
        return maxsum;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K value :");
        int k = scan.nextInt();
        int result = maxsubarray(nums,k);
        System.out.println("Maximum Sum is to :"+result);
    }
}