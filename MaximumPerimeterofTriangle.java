import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class MaximumPerimeterofTriangle{
    public static int maximumperimeter(int[] nums){
        Arrays.sort(nums);
        int n1 = nums[nums.length-1];
        int n2 = nums[nums.length-2];
        int n3 = nums[nums.length-3];
        int sum = 0;
        if(n1+n2>n3 && n2+n3>n1 && n1+n3>n2){
            sum = n1+n2+n3;
        }
        else{
            return -1;
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
        int result = maximumperimeter(nums);
        System.out.println("Maximum perimeter of Arrays :"+result);
    }
}