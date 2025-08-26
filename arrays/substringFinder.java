public class substringFinder{
    public static Boolean subStringMatch(String str, String subStr){
        for (int i = 0; i < str.length()-subStr.length(); i++){
            if(str.substring(i, i+subStr.length()).equals(subStr)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(subStringMatch("subStr", "sub"));
        System.out.println(subStringMatch("choasodfiubqwoienqoinfoanso", "foan"));
        System.out.println(subStringMatch("gooble", "sub"));


    }

}