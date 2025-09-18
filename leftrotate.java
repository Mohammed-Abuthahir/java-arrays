import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class leftrotate{
    public static void rotatearray(int[] nums,int k ){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = nums.length-k-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = nums.length-k;
        right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println("After Rotation :"+Arrays.toString(nums));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the rotate :");
        int k = scan.nextInt();
        System.out.println("Before Rotation :"+Arrays.toString(nums));
        rotatearray(nums,2);
    }
}