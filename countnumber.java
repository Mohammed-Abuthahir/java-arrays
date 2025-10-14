// Count number of elements between two given elements in array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countnumber{
    public static int count(int[] nums,int num1,int num2){
        int count = 0;
        int index1 = -1;
        int index2 = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==num1 && index1 == -1){
                index1 = i;
            }
            else if(nums[i]==num2){
                index2 = i;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(j>index1 && j<index2){
                count++;
            }
        }
        return count;
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
        System.out.println("Enter the First end :");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second end :");
        int num2 = scan.nextInt();
        int result = count(nums,num1,num2);
        System.out.println("Count :"+result);
    }
}