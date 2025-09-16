import java.util.*;
class rotatearraysafterone{
    public static void rotate(int[] nums){
        int last = nums[nums.length-1];
        for(int i = nums.length-1;i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = last;
        System.out.print(Arrays.toString(nums));
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays:");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        rotate(nums);
    
    }
}