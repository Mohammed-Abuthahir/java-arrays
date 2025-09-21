import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class longeststring{
    public static String longest(String[] arr){
        String max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i].length()>max.length()){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        scan.nextLine(); 
        System.out.println("Enter the Array :");
        String arr[] = new String[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextLine();
        }
        
        String result = longest(arr);
        System.out.println("The Long String is to :"+result);
    }
}