import java.util.Scanner;
import java.util.Arrays;
class reversearray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int left = 0;
        int right = nums.length-1;
        int temp = 0;
        while(left<=right){
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversing Array :"+Arrays.toString(nums));
          
    }
}