import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
class containsduplicate{
    public static boolean duplicate(int[] nums){
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums){
            if(s.contains(num)){
                return true;
            }
            else{
                s.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Answer is : "+duplicate(arr));
    }
}