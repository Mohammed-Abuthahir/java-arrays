// Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements in the array.
// Note: Return two elements where the first one in the count of odd & second one is the count of even.
import java.util.*;
class oddevencount{
    public static int[] count(int[] nums){
        int oddcount = 0;
        int evencount = 0;
        for(int n : nums){
            if(n%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        return new int[]{oddcount,evencount};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = scan.nextInt();
        System.out.println("Enter the arrays");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = count(nums);
        System.out.println(Arrays.toString(result));
    }
}