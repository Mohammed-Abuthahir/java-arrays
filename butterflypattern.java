import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class butterflypattern{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        // First Part
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
             for(int j = 1;j<=i;j++){
                 System.out.print("*");
            }
            System.out.println();
        }
        // Second part
       for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
             for(int j = 1;j<=i;j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}