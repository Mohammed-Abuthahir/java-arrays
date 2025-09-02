import java.util.Scanner;
import java.util.Arrays;
class numpalindrome{
    public static boolean palindrome(int num){
        int original = num;
        int reverse = 0;
        int rem;
        while(num>0){
            rem = num%10;
            reverse = (reverse*10)+rem;
            num = num/10;
        }
        if(original == reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        System.out.println(palindrome(num));
    }
}