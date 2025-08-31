import java.util.Scanner;
import java.util.Arrays;
class reversenumber{
    public static int reversenum(int num){
        int reverse = 0;
        int rem;
        while(num>0){
            rem = num%10;
            reverse = (reverse*10)+rem;
            num = num/10;
        }
        return reverse;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        System.out.println(reversenum(num));
    }
}