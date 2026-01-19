import java.util.*;
class minimum1row {
    public static int minimumrow(int[][] nums){

         ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            int sum = 0;
            for(int j = 0;j < nums[i].length;j++){
                if(nums[i][j] == 1){
                    sum++;
                }
            }
            list.add(sum);
        }
         int min = Integer.MAX_VALUE;;
        for(int num : list){
            min = Math.min(min,num);
        }
        int index = 0;
        for(int i = 0;i < list.size();i++){
            if(list.get(i) == min){
                index = i;
                break;
            }
        }
        return index + 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }

        System.out.println("Result : " + minimumrow(nums));
    }
}
