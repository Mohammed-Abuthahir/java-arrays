import java.util.*;
class solidrectangle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        // outer loop
        for(int i = 1;i<n;i++){
            // inner loop
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}