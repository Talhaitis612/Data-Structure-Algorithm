public class Main {
    public static void main(String[] args) {
        int [] arr = {63, 32, 42, 43,88,34};
        int target = 88;
        int ans = linearSearch(arr, target);

        System.out.println("Element found at index : " + ans);

        ans = linearSearch2(arr, target);

        System.out.println("Element found  : " + ans);

        boolean elementExists = linearSearch3(arr, target);
        System.out.println("Element Exists  : " + elementExists);



    }

    //what this method does it returns us index
    static int linearSearch(int[] arr, int target){
        //if the array length is lesser than 1 it will return -1 othewise return index
        if(arr.length<1){
            return Integer.MAX_VALUE;
        }

        for(int index = 0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }


        }

        return Integer.MAX_VALUE;
    }
    //another linear method that returns the element
    static int linearSearch2(int [] arr, int target){
        if(arr.length<1){
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }
    static boolean linearSearch3(int [] arr, int target){
        if(arr.length<1){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }

}