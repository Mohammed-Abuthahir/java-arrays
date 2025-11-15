import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class toughcompetitors{
    public static int minDiff(int[] nums){
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int sub = 0;
        if(nums.length%2==0){
            for(int i = 1;i<nums.length;i++){
                sub = nums[i] - nums[i-1];
                min = Math.min(sub,min);
            }
        }
        else{
             for(int i = 1;i<nums.length-2;i++){
                sub = nums[i] - nums[i-1];
                min = Math.min(sub,min);
            }
        }
        return min;
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
        int result = minDiff(nums);
        System.out.println("Minimum Diffrence is : "+result);
    }
}
