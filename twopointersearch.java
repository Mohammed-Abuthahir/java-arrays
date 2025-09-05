import java.util.Scanner;
import java.util.Arrays;
class twopointersearch{
    public static int twopointer(int[] nums,int target){
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]==target){
                return i; 
            }
            else if(nums[j] == target){
                return j;
            }
            else{
                i = i+1;
                j = j-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Enter the target :");
        int target = scan.nextInt();
        int result = twopointer(nums,target);
        if(result == -1){
            System.out.println("Element Not found");
        }
        else{
            System.out.println("elemnt found at :"+result);
        }
    }
}