import java.util.Scanner;
import java.util.Arrays;
class largestelement{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Arrays :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println("Largest element is : "+ max);
    }
}