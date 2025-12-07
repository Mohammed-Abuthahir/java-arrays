import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Secondlatgestelement{
    public static int secondlargest(int[] nums){
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max = Collections.max(set);
        set.remove(max);
        max = Collections.max(set);
        if(nums.length == 1){
            max = nums[0];
        }
        return max;
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entee the Number :");
        int n = scan.nextInt();
        System.out.println("Enter the Size :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = secondlargest(nums);
        System.out.println("Second Largest Element :"+result);

    }
}