public class substringFinder{
    public static Boolean subStringMatch(String a, String b){
        for (int i = 0; i <= a.length() - b.length(); i++) {
            int j = 0;
            while (j < b.length() && a.charAt(i + j) == b.charAt(j)) j++;
            if (j == b.length()) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(subStringMatch("subStr", "sub"));
        System.out.println(subStringMatch("choasodfiubqwoienqoinfoanso", "foan"));
        System.out.println(subStringMatch("gooble", "sub"));


    }

}