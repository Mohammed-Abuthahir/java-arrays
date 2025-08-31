import java.util.Scanner;
import java.util.Arrays;
class oddoreven{
    public static boolean oddoreven(int n)
    {
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = scan.nextInt();
        System.out.println(oddoreven(n));
    }
}