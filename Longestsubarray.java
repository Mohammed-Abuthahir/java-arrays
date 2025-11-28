// find the Longest subarray where the adjecent element between 0 and 2
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Longestsubarray{
    public static ArrayList<Integer> subarrayproblem(int[] nums){
        ArrayList <Integer> longest = new ArrayList<>();
        ArrayList <Integer> current = new ArrayList<>();
        current.add(nums[0]);
        for(int i = 1;i<nums.length;i++){
            int diff = Math.abs(nums[i] - nums[i - 1]);
            if(diff == 2 || diff == 0){
                current.add(nums[i]);
            }
            else{
                if(current.size() > longest.size()){
                    longest = new ArrayList<>(current);
                }
                current.clear();
                current.add(nums[i]);
            }
        }
        if(current.size() > longest.size()){
            longest = current;
        }
        return longest;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        ArrayList<Integer> result = subarrayproblem(nums);
        System.out.println("Longest subarray :"+result);
    }
}