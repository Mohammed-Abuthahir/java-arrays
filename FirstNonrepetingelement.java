import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FirstNonrepetingelement{
    public static int nonrepeating(int[] nums){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int repating = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                repating = key;
                break;
            }
        }
        return repating;
    }
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Size :");
       int n = scan.nextInt();
       System.out.println("Enter the Arrays :");
       int[] nums = new int[n];
       for(int i =0;i<nums.length;i++){
        nums[i] = scan.nextInt();
       }
       int result = nonrepeating(nums);
       System.out.println("First Non Repeating :"+result);
    }
}