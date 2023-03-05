public class SearchInRange {

    public static void main(String[] args) {
        int [] nums = {5,3,4,7,2,8,10,34,36};
        int foundIndex = searchInRange(nums, 2,6,88);
        System.out.println("Found at Index: "+ foundIndex);
    }

    static int searchInRange(int [] arr, int startRange, int endRange, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }


        for(int i = startRange; i< endRange; i++){
            int element = arr[i];
            if(element == target)
                return i;
        }
        return Integer.MAX_VALUE;
    }

}
