import java.util.Scanner;
import java.util.Arrays;
class removeduplicates{
    public static int duplicate(int[] nums){
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[left]!=nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left+1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int k = duplicate(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,k)));
    }
}
