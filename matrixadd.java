import java.util.Scanner;
import java.util.Scanner;
class matrixadd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row of first matrix :");
        int row1 = scan.nextInt();
        System.out.println("Enter the column of first matrix :");
        int column1 = scan.nextInt();
        System.out.println("Enter the row of Second matrix :");
        int row2 = scan.nextInt();
        System.out.println("Enter the column of Second matrix :");
        int column2 = scan.nextInt();
        if(row1 == row2 && column1 == column2){
            int a[][] = new int[row1][column2];
            int b[][] = new int[row2][column2];
            int c[][] = new int[row2][column2];
            System.out.println("Enter the first matrix Element :");
            for(int i = 0;i<a.length;i++){
                for(int j = 0;j<a[i].length;j++){
                    System.out.println("Enter the "+i+" "+j);
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter the Second element matrix :");
            for(int i = 0;i<a.length;i++){
                for(int j = 0;j<a[i].length;j++){
                    System.out.println("Enter the "+i+" "+j);
                    b[i][j] = scan.nextInt();
                }
            }
            for(int i = 0;i<a.length;i++){
                for(int j = 0;j<a[i].length;j++){
                    // System.out.println("Enter the "+i+" "+j);
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            for(int i = 0;i<a.length;i++){
                for(int j = 0;j<a[i].length;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrix should be the Same Size");
        }
    }
}