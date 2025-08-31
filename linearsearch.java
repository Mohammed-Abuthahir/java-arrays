import java.util.Scanner;
import java.util.Arrays;
class linearsearch{
    public static int linearsearch(int[] nums,int target){
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the target :");
        int target = scan.nextInt();
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Before Sorting :"+Arrays.toString(nums));
        int result = linearsearch(nums,target);
        if(result == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found at :"+result);
        }
    }
}