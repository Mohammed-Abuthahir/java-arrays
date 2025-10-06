import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class intersection{
    public static int InterSection(int[] arr1,int[] arr2){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j = 0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                System.out.print(arr2[j]+" ");
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Array 1 :");
        int[] arr1 = new int[n1];
        for(int i = 0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the Array 2 :");
        int[] arr2 = new int[n2];
        for(int i = 0;i<arr2.length;i++){
            arr2[i] = scan.nextInt();
        }
        int result = InterSection(arr1,arr2);
        System.out.println();
        System.out.println("Count : "+ result);
    }
}