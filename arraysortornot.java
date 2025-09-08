import java.util.Scanner;
import java.util.Arrays;
class arraysortornot{
    public static boolean arraysort(int[] nums){
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println(arraysort(nums));
    }
}