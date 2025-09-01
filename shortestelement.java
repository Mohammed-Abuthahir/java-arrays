import java.util.Scanner;
import java.util.Arrays;
class shortestelement{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int min = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println("Shortest Element in array : " + min);
    }
}