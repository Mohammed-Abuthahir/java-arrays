import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class CountPairsOddXor{
    public static int xorpair(int[] nums){
        int evencount = 0;
        int oddcount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 != 0){
                oddcount++;
            }
            else{
                evencount++;
            }
        }
        return oddcount * evencount;
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
        int result = xorpair(nums);
        System.out.println("Xor Odd Pair is to :"+result);
    }
}