import java.util.Scanner;
import java.util.Arrays;
class removeelement{
    public static int removeelement(int[] nums,int val){
        int left = 0;
        int right = nums.length;
        while(left<right){
            if(nums[left]==val){
                nums[left] = nums[right-1];
                right--;
            }
            else{
                left++;
            }
        }
        return right;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the array :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the value");
        int val = scan.nextInt();
        int k = removeelement(nums,val);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,k)));
    }
}