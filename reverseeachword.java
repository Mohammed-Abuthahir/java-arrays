import java.util.Scanner;
import java.util.Arrays; 
class reverseeachword{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String input = scan.nextLine();
        String output = "";
        String words[] = input.split(" ");
        for(String word : words){
            String revword = "";
            for(int i = word.length()-1;i>=0;i--){
                revword = revword + word.charAt(i);
            }
            output = revword + output + " ";
        }
        System.out.println(output);
    }
}