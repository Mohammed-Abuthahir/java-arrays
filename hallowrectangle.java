import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class hallowrectangle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = scan.nextInt();
        // outer loop
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}