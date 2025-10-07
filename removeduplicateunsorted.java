import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
class removeduplicateunsorted{
    public static int[] removeduplicate(int[] nums){
        Set<Integer> set = new LinkedHashSet<>();
        int index = 0;
        int result[] = new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            if(set.add(nums[i])){
                result[index] = nums[i];
                index++;
            }
        }
        return Arrays.copyOf(result,index);
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
        int[] result = removeduplicate(nums);
        System.out.println("After removing duplicates : "+ Arrays.toString(result));
    }
}