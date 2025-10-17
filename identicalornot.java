import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class identicalornot{
    public static boolean identical(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length!=nums2.length){
            return false;
        }
        for(int i = 0;i<nums1.length;i++){
            if(nums1[i]!=nums2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays 1 :");
        int[] nums1 = new int[n];
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2:");
        int[] nums2 = new int[n];
        for(int i = 0;i<nums2.length;i++){
            nums2[i] = scan.nextInt();
        }

        boolean result = identical(nums1,nums2);
        System.out.println("Result :" + result);
    }
}