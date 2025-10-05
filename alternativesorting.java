import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class alternativesorting{
    public static int[] alternative(int[] nums){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];
        int index = 0;
        while(left<=right){
            if(left != right){
                result[index++] = nums[right--];
                result[index++] = nums[left++];
            }
            else{
                result[index] = nums[left++];
                break;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] answer = alternative(nums);
        System.out.println("Alternatives Arrays :"+Arrays.toString(answer));
    }
}