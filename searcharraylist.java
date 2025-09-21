import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class searcharraylist{
    public static int searchelement(ArrayList<Integer> arr,int target){
        int count = 0;
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)!=target){
                count++;
            }
            else{
                count++;
                return count;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9, 7, 16, 16, 4));
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        int result = searchelement(arr,target);
        System.out.println("Element Found :"+result);
    }
}