// Mr. Geek is a greedy seller. He has a stock of some laptops comprising both useful and useless laptops. Now, he wants to organize a sale to clear his stock of useless laptops. The prices of laptops are arri each consisting of positive and negative integers (-ve denoting useless laptops). In a day, he can sell almost m laptops. Mr. Geek, a greedy seller, wants to earn maximum profit from this sale and sell useless laptops. So, help him maximize his profit by selling useless laptops input = arr = [5, -3, -2, 1, 0] m = 2 output = 5
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Megasale{
    public static int megasale(int[] nums,int m){
        int sum = 0;
        Arrays.sort(nums);
        if(nums.length<m){
            for(int i = 0;i<nums.length;i++){
                if(nums[i]<0){
                    sum = sum - (nums[i]);
                }
            }
        }
        else{
            for(int j = 0;j<m;j++){
                if(nums[j]<0){
                    sum = sum - (nums[j]);
                }
            }
        }
        return sum;
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
        System.out.println("Enter the M :");
        int m = scan.nextInt();
        int result = megasale(nums,m);
        System.out.println("Result :"+result);

    }
}