import java.util.Scanner;
import java.util.Arrays;
class primeornot{
    public static String primeornot(int num){
        int count = 0;
        for(int i = 1;i<=num;i++){
            if(num%i==0)
            {
                count++;
            }
        }
        if(count == 2){
            return "primeNumber";
        }
        else{
            return "NotPrimeNumber";
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(primeornot(n));
    }
}