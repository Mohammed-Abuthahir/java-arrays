import java.util.Scanner;
import java.util.Arrays;
class reversestring{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String :");
        String s = scan.nextLine();
        // with using predefained function
        // StringBuilder sb = new StringBuilder(s);
        // System.out.print(sb.reverse());
        
        // without using function
        for(int i = s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}