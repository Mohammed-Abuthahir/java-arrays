import java.util.Scanner;
import java.util.Arrays;
class anagram{
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);
        return s1.equals(s2);
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String1 :");
        String s1 = scan.nextLine();
        System.out.println("Enter the String2 :");
        String s2 = scan.nextLine();
        System.out.println(anagram(s1,s2));
    }
}