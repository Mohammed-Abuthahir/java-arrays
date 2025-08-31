import java.util.Scanner;
import java.util.Arrays;
class bubblesort{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int temp = 0;
        int n = scan.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the Array :");
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Before Sorting :"+Arrays.toString(nums));
        for(int i = 0 ;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j])
                 temp = nums[i];
                 nums[i] = nums[j];
                 nums[j] = temp;
            }
             
        }
        System.out.println("After Sorting :"+Arrays.toString(nums));
       
    }
}