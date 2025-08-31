import java.util.Scanner;
import java.util.Arrays;
class swapnumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1 = scan.nextInt();
        System.out.println("Enter the Number 2");
        int num2 = scan.nextInt();
        System.out.println("Before Swapping num1 = "+num1 +" num2 = "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1 - num2;
        System.out.println("After Swapping num1 = " +num1 +" num2 = "+num2);
    }
}