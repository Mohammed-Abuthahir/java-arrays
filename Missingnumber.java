import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Missingnumber{
    public static int missing(int[] nums1,int[] nums2){
        int sum1 = 0;
        int sum2 = 0;
        for(int n : nums1){
            sum1 = sum1 + n;
        }
        for(int n : nums2){
            sum2 = sum2 + n;
        }
        int mis = sum1 - sum2;
        return mis;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the First Arrays 1: ");
        int[] nums1 = new int[n1];
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2");
        int[] nums2 = new int[n2];
          for(int i = 0;i<nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        int result = missing(nums1,nums2);
        System.out.println("Result :"+result);
    }
}