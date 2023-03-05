public class SearchInString {

    public static void main(String[] args) {
        String name = "Talha";
        char target = 'T';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char c) {
//        this is one way
//        char[] arr = str.toCharArray();
//        if(str.length()==0){
//            return false;
//        }
//        for (int i =0; i<str.length(); i++){
//            if(arr[i]==c){
//                return true;
//            }
//        }
//        return  false;
//        another way to do it
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }

        for (char c : str.toCharArray()){
            if(c == target){
                return  true;
            }
        }
        return false;
    }

}
