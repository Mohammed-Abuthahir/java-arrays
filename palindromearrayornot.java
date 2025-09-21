import java.util.Scanner;
import java.util.Arrays;
class palindromearrayornot{
    public static boolean palindromearrayornot(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = nums.length-1;
        while(left<=right){
            if(nums[left]!=nums[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = palindromearrayornot(nums);
        System.out.println(result);
    }
}