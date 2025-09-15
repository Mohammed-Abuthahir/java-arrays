import java.util.*;
class countsmallest{
    public static int count(int[] nums,int x){
        int count = 0;
        for(int n : nums){
            if(n<=x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = scan.nextInt();
        System.out.println("Enter the arrays");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Check Element");
        int x = scan.nextInt();
        int result = count(nums,x);
        System.out.println(result);
    }
}