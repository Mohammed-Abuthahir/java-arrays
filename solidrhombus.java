import java.util.Scanner;
import java.util.Arrays;
class solidrhombus{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = n;j>i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}