//1. Implement an algorithm to determine if a string has all unique characters. 

public class isUnique{

    public static Boolean isUnique(String str){
        String tmp = str;
        for(int i = 0; i < str.length(); i++){
            for (int x = 0; x < tmp.length(); x++) {

                if(x == i){
                    // continue;
                }
                else{
                    if(str.charAt(i) == tmp.charAt(x)){
                        return false;
                    }
                }


            }
        }
        return true;

        
    }
     public static void main(String[] args) {
        System.out.println(isUnique("fortnite"));
        System.out.println(isUnique("mango")); 
     }
}