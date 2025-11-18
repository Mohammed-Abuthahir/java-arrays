// A person needs to reach home by train but compulsively switches trains at every station. If they start with train arr1 at the first station, they will switch to train arr2 at the next station, and then switch back to train arr1 at the following station, and so on. Similarly, if they start with train arr2, they will switch to train arr1 at the next station, and continue alternating.

// Given two arrays, arr1 and arr2, where:

// arr1[i] represents the time taken by train arr1 at station i.
// arr2[i] represents the time taken by train arr2 at station i.
// Determine the minimum total time required to reach home starting from either train arr1 or train arr2, with the switching pattern maintained.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Aguywithamentalproblem{
    public static int calculate(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr1.length;i++){
            if(i%2 == 0){
                list.add(arr1[i]);
            }
        }
        for(int i = 0;i<arr2.length;i++){
            if(i%2 != 0){
                list.add(arr2[i]);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0;i<arr2.length;i++){
            if(i%2 == 0){
                list1.add(arr2[i]);
            }
        }
        for(int i = 0;i<arr1.length;i++){
            if(i%2 != 0){
                list1.add(arr1[i]);
            }
        }
        int sum1 = 0;
        for(int num1 : list){
            sum1 = sum1 + num1;
        }
        int sum2 = 0;
        for (int num2 : list1) {
            sum2 = sum2 + num2;
        }
        int min = Math.min(sum1,sum2);
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1");
        int n1 = scan.nextInt();
        System.out.println("Enter the size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays1 :");
        int[] arr1 = new int[n1];
        for(int i = 0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2 :");
        int[] arr2 = new int[n2];
        for(int i = 0;i<arr2.length;i++){
            arr2[i] = scan.nextInt();
        }
        int result = calculate(arr1,arr2);
        System.out.println("Result :" + result);
    }
}