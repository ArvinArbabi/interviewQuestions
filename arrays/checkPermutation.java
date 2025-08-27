//2. Given two strings, write a method to see if one is a permutation of the other.
public class checkPermutation{
    
    public static boolean isPermutation(String str1, String str2) {
        int charMatch = 0;
        if(str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            for (int x = 0; x < str1.length(); x++){
                
                if (x == i){
                }
                else{                    
                    if(str1.charAt(i) == str2.charAt(x)){
                        charMatch++;
                    }
                    if (charMatch == str1.length()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "bca"));
        System.out.println(isPermutation("aab", "aba"));
        System.out.println(isPermutation("aab", "abb"));
        System.out.println(isPermutation("aabc", "aab"));
    }
}