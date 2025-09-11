import java.util.Scanner;
import java.util.Arrays;
class mergesort{
    public static void mergesort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        int leftstartingarray = left;
        int rightstartingarray = mid+1;
        int lefthalf[] = new int[mid-left+1];
        int righthalf[] = new int[right-mid];
        for(int i = 0;i<lefthalf.length;i++){
            lefthalf[i] = arr[leftstartingarray+i];
        }
        for(int j =0;j<righthalf.length;j++){
            righthalf[j] = arr[rightstartingarray+j];
        }
        int index = left;
        int p1 = 0;
        int p2 = 0;
        while(p1<lefthalf.length && p2<righthalf.length){
            if(lefthalf[p1]<righthalf[p2]){
                arr[index++] = lefthalf[p1];
                p1++;
            }
            else{
                arr[index++] = righthalf[p2];
                p2++;
            }
        }
        while(p1<lefthalf.length){
                arr[index++] = lefthalf[p1];
                p1++;
        }
        while(p2<righthalf.length){
             arr[index++] = righthalf[p2];
             p2++;
    }
}
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Before Sorting :"+Arrays.toString(nums));
        mergesort(nums,0,nums.length-1);
        System.out.println("After Sorting :"+Arrays.toString(nums));
    }
}
