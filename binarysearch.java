import java.util.Scanner;
import java.util.Arrays;
class binarysearch{
    public static int binarysearch(int[] nums,int target){
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
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = scan.nextInt();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int result = binarysearch(nums,target);
        if(result == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Index :"+result);
        }
    }
}