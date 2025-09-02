import java.util.Scanner;
import java.util.Arrays;
class pangram{
    public static void main(String[] args){
        String s = "The quick ";
        int n = s.length();
        if(n<26){
            System.out.println("Not a Pangram");
            return;
        }
        boolean arr[] = new boolean[26];
        for(int i = 0;i<n;i++){
            char x = s.charAt(i);
            if(x>='a' && x<='z'){
                arr[x-'a'] = true;
            }
            else if(x>='A' && x<='Z'){
                arr[x-'A'] = true;
            }
        }
        for(int i = 0;i<26;i++){
            if(arr[i]== false){
                System.out.println("Not a Pangram");
            }
        }
        System.out.println("Pangram");
    }
}