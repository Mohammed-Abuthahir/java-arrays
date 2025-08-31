import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
class duplicatejava{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
        Set<Integer> s = new LinkedHashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            s.add(nums[i]);
        }
        System.out.println(s);
    }
}