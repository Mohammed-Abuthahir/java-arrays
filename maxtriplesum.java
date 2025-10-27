import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxtriplesum{
    public static int triplemax(int[] nums){
        Arrays.sort(nums);
        int max = nums[nums.length-1]+ nums[nums.length-2]+nums[nums.length-3];
        return max;
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
        int result = triplemax(nums);
        System.out.println("result :" + result);
    }
}