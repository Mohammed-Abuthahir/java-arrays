import java.util.Scanner;
import java.util.Arrays;
class countoddoreven{
    public static int countoddoreven(int nums){
        int oddcount = 0;
        int evencount = 0;
        for(int i = 1;i<=nums;i++){
            if(i%2!=0){
                oddcount++;
                
            }
            else{
                evencount++;
            }
            
        }
        return evencount;
        
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        System.out.println(countoddoreven(num));
    }
}