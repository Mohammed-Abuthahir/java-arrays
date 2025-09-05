import java.util.Scanner;
import java.util.Arrays;
class binarytodecimal{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int rem = 0;
        double temp = 0;
        int count = 0;
        while(num>=1){
            rem = num%10;
            double product = rem * Math.pow(2,count);
            temp = temp + product;
            num = num/10;
            count++;
        }
        int result = (int)temp;
        System.out.println(result);
    }
}