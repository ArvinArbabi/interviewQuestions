public class URLify {
    public static String urlify(String str) {
        String newStr = "";
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == ' '){
                newStr += "%20";
            }
            else{
                newStr += str.charAt(i);
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(urlify("mango chud sigma"));
    }
}
