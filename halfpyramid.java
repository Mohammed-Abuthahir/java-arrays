import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class halfpyramid{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}