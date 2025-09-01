 import java.util.Scanner;
 import java.util.Arrays;
 class stringpalindrome{
    public static boolean palindrome(String original){
        String reverse = "";
        for(int i = original.length()-1;i>=0;i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String original = scan.nextLine();
        System.out.println(palindrome(original));
    }
 }