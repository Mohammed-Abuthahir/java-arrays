import java.util.Scanner;
import java.util.Arrays;
class insertelement{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Arrays :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Before Sorting Arrays :"+Arrays.toString(nums));
        System.out.println("Enter the Index :");
        int index = scan.nextInt();
        System.out.println("Enter the value :");
        int value = scan.nextInt();
        for(int i = nums.length-1;i>index;i--){
            nums[i] = nums[i-1];
        }
        nums[index] = value;
        System.out.println("After sorting :"+Arrays.toString(nums));

    }
}