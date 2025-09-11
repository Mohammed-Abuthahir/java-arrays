// to write a program for odd nums ascending order and even number decending order cannot create 
// new arrays
import java.util.Scanner;
import java.util.Arrays;
class zoho{
    public static void sorting(int[] nums){
        // odd number iterartion
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2!=0){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j]%2!=0 && nums[j]<nums[i]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        // Even numsber itertion
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j]%2==0 && nums[j]>nums[i]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                    }
                }
            }
        }
        System.out.println("Arrays :"+Arrays.toString(nums));
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
        sorting(nums);
    }
}