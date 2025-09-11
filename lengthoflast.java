import java.util.Scanner;
import java.util.Arrays;
class lengthoflast{
    public static int lastword(String s){
        String m = s.stripTrailing();
        int length = 0;
        for(int i = m.length()-1;i>=0;i--){
            if(m.charAt(i)==' '){
                return length;
            }
            else{
                length++;
            }
        }
        return length;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println(lastword(s));
    }
}