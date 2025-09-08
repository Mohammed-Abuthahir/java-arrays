import java.util.Scanner;
import java.util.Arrays;
class movezero{
    public static void move(int[] nums){
        if(nums==null || nums.length<=1){
            return;
        }
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        System.out.println("After Moving Zeros :"+Arrays.toString(nums));
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        movezero m = new movezero();
        m.move(nums);
    }
}