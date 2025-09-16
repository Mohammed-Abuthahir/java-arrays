import java.util.Scanner;
import java.util.*;
class zerotonetriangle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n  = scan.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                int sum = (i+j);
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}