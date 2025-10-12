import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumsumsubarray{
    public static int minimumsum(int[] nums,int k){
        int windowsum = 0;
        int minsum = Integer.MAX_VALUE;
        for(int i = 0;i < k; i++){
            windowsum = windowsum + nums[i];
        }
        for(int i = k;i<nums.length;i++){
            windowsum = windowsum - nums[i-k] + nums[i];
            minsum = Math.min(windowsum,minsum);

        }
        return minsum;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = minimumsum(nums,k);
        System.out.println("Minimun sum is to :"+result);
    }
}

