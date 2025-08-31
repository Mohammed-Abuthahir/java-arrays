import java.util.Scanner;
import java.util.Arrays;
class fibonacci{
   
        
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scan.nextInt();
        int a = -1, b = 1,c;
        for(int i = 0;i<num;i++){
            c = a+b;
            System.out.print(c);
            a = b;
            b = c;
        }
    }
}