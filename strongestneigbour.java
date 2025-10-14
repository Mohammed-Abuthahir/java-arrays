import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class strongestneigbour{
    public static int[] strongneighbour(int[] nums){
        int[] arr = new int[nums.length-1];
        int i = 0;
        int left = 0;
        for(int right = 1;right<nums.length;right++){
            if(nums[left]>nums[right]){
                arr[i] = nums[left];
                left++;
                i++;
            }
            else{
                arr[i] = nums[right];
                left++;
                i++;
            }
        }
        return arr;
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
        int[] result = strongneighbour(nums);
        System.out.println("Strong Neightbour :"+Arrays.toString(result));
    }
}
