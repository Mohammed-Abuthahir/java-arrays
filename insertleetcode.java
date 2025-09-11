import java.util.Scanner;
import java.util.Arrays;
class insertleetcode{
    public static int insert(int[] nums,int target){
        System.out.println("Array :"+Arrays.toString(nums));
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the target :");
        int target = scan.nextInt();
        System.out.println(insert(nums,target));
    
    }
}