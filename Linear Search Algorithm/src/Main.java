public class Main {
    public static void main(String[] args) {
        int [] arr = {63, 32, 42, 43,88,34};
        int target = 88;
        int ans = linearSearch(arr, target);

        System.out.println("Element found at index : " + ans);

    }

    static int linearSearch(int[] arr, int target){
        //if the array length is lesser than 1 it will return -1 othewise return index
        if(arr.length<1){
            return -1;
        }

        for(int index = 0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }


        }

        return -1;
    }
}