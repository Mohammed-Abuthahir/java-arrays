import java.util.Scanner;
import java.util.Arrays;
class leapyear{
    public static String leapyearr(int year){
        if(year%4==0 || (year%100==0 && year%400== 0)){
            return "Leapyear";
        }
        else{
            return "NotLeapyear";
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year = scan.nextInt();
        System.out.println(leapyearr(year));

    }
}