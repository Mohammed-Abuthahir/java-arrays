import java.util.*;

public class alternatepositiveandnegative{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] arr = new int[n1];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int n = arr.length;

        // Step 1: Separate positive and negative elements
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int p = 0, ne = 0;

        for (int num : arr) {
            if (num > 0)
                pos[p++] = num;
            else
                neg[ne++] = num;
        }

        // Step 2: Merge alternately (positive, negative)
        int i = 0, j = 0, k = 0;
        while (i < p && j < ne) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        // Step 3: Print rearranged array
        System.out.println(Arrays.toString(arr));
    }
}
