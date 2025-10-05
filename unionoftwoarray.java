import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class unionoftwoarray{
    public static void union(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j = 0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println(set);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of N1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size of N2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays1 :");
        int[] arr1 = new int[n1];
        for(int i = 0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays2 :");
        int[] arr2 = new int[n2];
        for(int j = 0;j<arr2.length;j++){
            arr2[j] = scan.nextInt();
        }
        union(arr1,arr2);
    }
}