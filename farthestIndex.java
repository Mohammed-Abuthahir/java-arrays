// Given a positive integer x and an array arr of positive integers. We need to find the farthest index at which x is present. If any occurrence of x doesn't exist, then return -1.
// input: arr[] = [7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7] and x = 7
// Output: 11
// Explanation: The last index contains value 7.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class farthestIndex{
    public static int findingindex(int[] nums,int x){
        int farthestindex = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==x){
                farthestindex = i + 1;
            }
        }
        return farthestindex;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the X :");
        int x = scan.nextInt();
        int result = findingindex(nums,x);
        System.out.println("Farthest Index : "+result);
    }
}