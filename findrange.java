import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class findrange{
    public static boolean checkelements(int[] nums,int A ,int B){
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i = A;i<=B;i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
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
        
        System.out.println("Enter the Range A:");
        int A = scan.nextInt();
        System.out.println("Enter the Range B");
        int B = scan.nextInt();
        boolean result = checkelements(nums,A,B);
        System.out.println("Result :"+result);
    }
}