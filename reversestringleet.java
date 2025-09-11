import java.util.Scanner;
import java.util.Arrays;
class reversestringleet{
    public static void reversestring(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left<=right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        char[] s = {'h','e','l','l','o'};    
        reversestring(s);
        System.out.println("After reverse :"+Arrays.toString(s));
    }
}