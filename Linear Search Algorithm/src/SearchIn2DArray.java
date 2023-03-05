import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int [][] arr = {
                {4,5,6},
                {9, 8,10},
                {1,3,5}
        };

        System.out.println("element found at index : "+ Arrays.toString(searchIn2DArray(arr, 6)));
    }

    static int[] searchIn2DArray(int [][]arr, int target){

        for(int row =0; row <arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{0,0};
    }
}
