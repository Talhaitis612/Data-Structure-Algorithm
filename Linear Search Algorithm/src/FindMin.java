public class FindMin {

    public static void main(String[] args) {
        int [] arr = {-3,34,4,234,34,-48};
        System.out.println("The minimum number is :" + findMinimum(arr));
    }

    static int findMinimum(int [] arr){
        if(arr.length == 0){
            return -1;
        }
        int minNumber = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] < minNumber){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }
}
