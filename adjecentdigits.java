import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class adjecentdigits{
    public static boolean adjecent(int num){
        int predigit = num % 10;
        num = num/10;
        while(num>0){
            int currdigit = num % 10;
            if(Math.abs(currdigit - predigit)!=1){
                return false;
            }
            predigit = currdigit;
            num = num / 10;
        }
        return true;
    }
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        for(int num : nums){
            if(num >=10 && num < k){
                if(adjecent(num)){
                    list.add(num);
                }
            }
        }
        System.out.println(list);
    }
    
}