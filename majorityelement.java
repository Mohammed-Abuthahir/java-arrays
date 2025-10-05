import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class majorityelement{
    public static void majorityelement(int[] nums){
        int n = nums.length-1;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                System.out.println("Majority element : "+key);
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        majorityelement(nums);
       
    }
}