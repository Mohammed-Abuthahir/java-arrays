import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
class removegreateselement{
    public static int[] longest(int[] nums){
         for(int i = 1;i<nums.length;i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;

        }
    return Arrays.copyOf(nums,nums.length-2);
}
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = longest(nums);
        System.out.println(Arrays.toString(result));
    }
}