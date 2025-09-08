import java.util.Scanner;
import java.util.Arrays;
class rotatearray{
    public static void rotate(int[] nums,int k){
        if(nums==null || k == nums.length || nums.length == 1) return;
        if(k>nums.length){
            k = k % nums.length;
        }
        int left = 0;
        int right = nums.length - 1 - k;
        int nextleft = right + 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        right = nums.length -1 ;
        while(nextleft<right){
            int temp = nums[nextleft];
            nums[nextleft] = nums[right];
            nums[right] = temp;
            nextleft++;
            right--;
        }
        left = 0;
        right = nums.length - 1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of array :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays;");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K");
        int k = scan.nextInt();
        rotate(nums,k);
        System.out.println("After Array Rotaion :"+Arrays.toString(nums));
    }
}